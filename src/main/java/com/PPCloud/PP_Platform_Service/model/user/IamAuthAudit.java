package com.PPCloud.PP_Platform_Service.model.user;

import com.PPCloud.PP_Platform_Service.model.BaseModel;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * IamAuthAudit
 *
 * 所有认证相关行为的审计日志。
 *
 * ⚠️ 永远只增不改
 */
@Document(collection = "iam_auth_audit")
@CompoundIndex(
        name = "idx_audit_user_time",
        def = "{'tenantId':1,'userId':1,'createdAt':-1}"
)
public class IamAuthAudit extends BaseModel {

    /**
     * 用户 ID（失败场景可能为空）
     */
    private String userId;

    /**
     * 事件类型
     */
    private String eventType;

    /**
     * 失败/拒绝原因码
     */
    private String reasonCode;

    /**
     * 客户端 IP
     */
    private String ip;

    /**
     * User-Agent
     */
    private String ua;

    /**
     * 设备 ID
     */
    private String deviceId;

    /**
     * AppClient / 业务系统标识
     */
    private String clientId;

    /**
     * 扩展元数据
     */
    private Object meta;
}