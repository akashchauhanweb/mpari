package com.zepto;

/* JADX INFO: loaded from: classes.dex */
public class tf1 implements be5 {
    public static final float DEFAULT_BACKOFF_MULT = 1.0f;
    public static final int DEFAULT_MAX_RETRIES = 1;
    public static final int DEFAULT_TIMEOUT_MS = 2500;
    private final float mBackoffMultiplier;
    private int mCurrentRetryCount;
    private int mCurrentTimeoutMs;
    private final int mMaxNumRetries;

    public tf1() {
        this(DEFAULT_TIMEOUT_MS, 1, 1.0f);
    }

    public float getBackoffMultiplier() {
        return this.mBackoffMultiplier;
    }

    @Override // com.zepto.be5
    public int getCurrentRetryCount() {
        return this.mCurrentRetryCount;
    }

    @Override // com.zepto.be5
    public int getCurrentTimeout() {
        return this.mCurrentTimeoutMs;
    }

    public boolean hasAttemptRemaining() {
        return this.mCurrentRetryCount <= this.mMaxNumRetries;
    }

    @Override // com.zepto.be5
    public void retry(bu7 bu7Var) throws bu7 {
        this.mCurrentRetryCount++;
        int i = this.mCurrentTimeoutMs;
        this.mCurrentTimeoutMs = i + ((int) (i * this.mBackoffMultiplier));
        if (!hasAttemptRemaining()) {
            throw bu7Var;
        }
    }

    public tf1(int i, int i2, float f) {
        this.mCurrentTimeoutMs = i;
        this.mMaxNumRetries = i2;
        this.mBackoffMultiplier = f;
    }
}
