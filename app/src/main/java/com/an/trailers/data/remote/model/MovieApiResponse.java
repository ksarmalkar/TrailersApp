package com.an.trailers.data.remote.model;


import com.an.trailers.data.local.entity.MovieEntity;

import java.util.List;

public class MovieApiResponse {

    private long page;
    private long totalPages;
    private long totalResults;
    private List<MovieEntity> results;

    public long getPage() {
        return page;
    }

    public void setPage(long page) {
        this.page = page;
    }

    public long getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(long totalPages) {
        this.totalPages = totalPages;
    }

    public long getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(long totalResults) {
        this.totalResults = totalResults;
    }

    public List<MovieEntity> getResults() {
        return results;
    }

    public void setResults(List<MovieEntity> results) {
        this.results = results;
    }
}
