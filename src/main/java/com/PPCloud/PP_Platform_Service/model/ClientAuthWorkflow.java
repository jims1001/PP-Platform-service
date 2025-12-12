package com.PPCloud.PP_Platform_Service.model;

import lombok.*;
import lombok.experimental.SuperBuilder;
import org.springframework.data.mongodb.core.index.*;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter @Setter
@SuperBuilder
@NoArgsConstructor @AllArgsConstructor
@Document("pp_client_auth_workflow")
@CompoundIndex(name = "idx_client", def = "{ 'clientId': 1 }", unique = true)
public class ClientAuthWorkflow extends BaseModel {

    @Indexed(unique = true)
    private String clientId;

    private String workflowId;
    private Integer version;
    private Boolean enabled;
}