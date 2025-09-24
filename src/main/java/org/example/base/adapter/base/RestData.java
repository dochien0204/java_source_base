package org.example.base.adapter.base;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.base.domain.entity.Pagination;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RestData<T> {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private RestStatus status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String devMessage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private T data;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Pagination pagination;

    public RestData(T data) {
        this.data = data;
    }

    public RestData(String userMessage) {
        this.message = userMessage;
    }

    public RestData(T data, String userMessage) {
        this.data = data;
        this.message = userMessage;
    }

    public RestData(T data, Pagination pagination, String userMessage) {
        this.data = data;
        this.message = userMessage;
        this.pagination = pagination;
    }

    public RestData(String userMessage, String devMessage) {
        this.message = userMessage;
        this.devMessage = devMessage;
    }

    public RestData(T data, String userMessage, Pagination pagination) {
        this.data = data;
        this.message = userMessage;
        this.pagination = pagination;
    }

    public RestData(RestStatus status, String userMessage, T data) {
        this.status = status;
        this.message = userMessage;
        this.data = data;
    }

    public RestData(RestStatus status, String userMessage, T data, Pagination pagination) {
        this.status = status;
        this.message = userMessage;
        this.data = data;
        this.pagination = pagination;
    }

    public RestData(RestStatus status, String userMessage, String devMessage) {
        this.status = status;
        this.message = userMessage;
        this.devMessage = devMessage;
    }
}
