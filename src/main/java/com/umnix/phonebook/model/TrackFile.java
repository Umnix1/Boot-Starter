package com.umnix.phonebook.model;

import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;

public class TrackFile {
    private InputStreamResource isr;
    private HttpHeaders headers;

    public TrackFile(InputStreamResource isr, HttpHeaders headers) {
        this.isr = isr;
        this.headers = headers;
    }

    public InputStreamResource getIsr() {
        return isr;
    }

    public void setIsr(InputStreamResource isr) {
        this.isr = isr;
    }

    public HttpHeaders getHeaders() {
        return headers;
    }

    public void setHeaders(HttpHeaders headers) {
        this.headers = headers;
    }
}
