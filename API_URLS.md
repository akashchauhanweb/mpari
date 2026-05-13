# mParivahan — Vehicle Number Lookup API Reference

Extracted by reverse-engineering the APK (`libsystem-arch.so` native library).  
The URLs are hidden in the native layer and assembled at runtime; the values below
were recovered by disassembling the JNI functions and reading the embedded strings.

---

## Base URL

```
https://delhigw.napix.gov.in/nic/parivahan/mparivahan/nrapi/
```

Returned by the native method `APIController.getNexGenNrapiPro()` (JNI symbol
`Java_com_nic_mparivahan_APIController_getNexGenNrapiPro`, string offset `0x15610`
in `libsystem-arch.so`).

---

## Endpoint 1 — Vehicle Number Search

| Property | Value |
|---|---|
| Method | `POST` |
| Full URL | `https://delhigw.napix.gov.in/nic/parivahan/mparivahan/nrapi/service/getSearchDocDetails` |
| Native method | `APIController.GetSearchDocDetails()` |
| JNI symbol | `Java_com_nic_mparivahan_APIController_GetSearchDocDetails` |
| String offset | `0x15cb1` in `libsystem-arch.so` |

### When is it called?

Triggered as soon as the user types a vehicle registration number and submits the
search in `SearchRC` (the RC search screen).

Call chain:
```
SearchRC.M(searchNumber)           [SearchRC.java:1938]
  └─ a55.N(mString, user_id, ctx) [a55.java:775]
       └─ s45.d(requestBody, ts)  [s45.java:38]
            └─ RcService.getRcValues(url, body, timestamp)  [RcService.java — @POST]
```

### Request

**Headers**
```
Content-Type: application/json
Accept:       application/json
timestamp:    <epoch-millis>
```

**Body** (JSON, built by `z45.a.f()`)
```json
{
  "rcNumber":  "<vehicle_registration_number>",
  "recordId":  <user_id_as_long>,
  "did":       "<android_device_id>",
  "mid":       "<mobile_number>",
  "tid":       "<tenant_id>"
}
```

### Response

Parsed into `ValidateRcSuccess`. A status code of `"NP001"` indicates success;
any other value surfaces `statusDesc` as a toast error to the user.

---

## Endpoint 2 — RC Validation (with Chassis / Engine)

| Property | Value |
|---|---|
| Method | `POST` |
| Full URL | `https://delhigw.napix.gov.in/nic/parivahan/mparivahan/nrapi/service/vindicateRc` |
| Native method | `APIController.ValidateRC()` |
| JNI symbol | `Java_com_nic_mparivahan_APIController_ValidateRC` |
| String offset | `0x16b01` in `libsystem-arch.so` |

### When is it called?

Called when the user provides **chassis number and/or engine number** in addition
to the vehicle registration number, to perform a stronger ownership verification.

Call chain:
```
SearchRC (chassis/engine submit)   [SearchRC.java:867, 1278]
  └─ a55.m(mString, user_id, chass, engin_no, ctx, type)  [a55.java:1025]
       └─ s45.j(requestBody, ts)  [s45.java:74]
            └─ RcService.validateRc(url, body, timestamp)  [RcService.java — @POST]
```

### Request

**Headers**
```
Content-Type: application/json
Accept:       application/json
timestamp:    <epoch-millis>
```

**Body** (JSON, built by `z45.a.a()`)
```json
{
  "rcNumber":  "<vehicle_registration_number>",
  "recordId":  <user_id_as_long>,
  "chasi5":    "<chassis_number>",
  "engine5":   "<engine_number>",
  "did":       "<android_device_id>",
  "mid":       "<mobile_number>",
  "tid":       "<tenant_id>",
  "param":     "<type>"
}
```

---

## How the URL is assembled at runtime

```
final URL = getNexGenNrapiPro()  +  <endpoint>
          = s14.a.u()            +  APIController.a().<method>()
```

Both halves are `native` methods declared in `APIController.java` and implemented
in `libsystem-arch.so` (loaded via `System.loadLibrary("system-arch")`).  
The Retrofit client is built with `s14.a.u()` as the `baseUrl` and each call
passes the full absolute URL via `@Url` — overriding the base URL per-request.

---

## Source files

| File | Role |
|---|---|
| `com/nic/mparivahan/APIController.java` | Declares all `native` URL methods |
| `com/nic/mparivahan/RC/RcInterface/RcService.java` | Retrofit interface (`@POST` definitions) |
| `com/zepto/s45.java` | Repository layer — assembles URLs and invokes Retrofit |
| `com/zepto/a55.java` | ViewModel — builds request bodies and calls `s45` |
| `com/nic/mparivahan/RC/SearchRC.java` | UI entry point — triggers search on user input |
| `com/zepto/z45.java` | Request body builder (JSON construction) |
| `lib/*/libsystem-arch.so` | Native library holding all URL strings |
