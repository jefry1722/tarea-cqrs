package com.example.cqrs.application.queries;

public class GetUserQuery {
    private Long id;

    public GetUserQuery(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
