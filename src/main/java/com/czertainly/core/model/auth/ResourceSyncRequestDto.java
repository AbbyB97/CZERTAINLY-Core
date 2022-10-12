package com.czertainly.core.model.auth;

import io.swagger.v3.oas.annotations.media.Schema;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.List;

public class ResourceSyncRequestDto {

    @Schema(description = "Name of the resource", required = true, example = "client")
    private Resource name;

    @Schema(description = "Action Names", required = true, example = "list")
    private List<String> actions;

    @Schema(description = "Is endpoint for listing objects flag - true = Yes; false = No", required = true)
    private String listObjectsEndpoint;

    public Resource getName() {
        return name;
    }

    public void setName(Resource name) {
        this.name = name;
    }

    public List<String> getActions() {
        return actions;
    }

    public void setActions(List<String> actions) {
        this.actions = actions;
    }

    public String getListObjectsEndpoint() {
        return listObjectsEndpoint;
    }

    public void setListObjectsEndpoint(String listObjectsEndpoint) {
        this.listObjectsEndpoint = listObjectsEndpoint;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
                .append("resourceName", name)
                .append("actions", actions)
                .append("listObjectsEndpoint", listObjectsEndpoint)
                .toString();
    }
}