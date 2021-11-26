/*
 * Copyright (C) @2021 Webank Group Holding Limited
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package cn.webank.dockin.rm.bean.podgroup;

import cn.webank.dockin.rm.web.bean.BaseDTO;
import cn.webank.dockin.rm.bean.resource.ContainerResource;
import cn.webank.dockin.rm.database.dto.PodInfoDTO;
import org.springframework.util.StringUtils;

/**
 * pod group
 * The basic unit of container managment
 */
public class PodGroup extends BaseDTO {

    private PodGroupType type = PodGroupType.NormalApp;

    private String name;

    private String subsystemId;

    private String dcn;

    private String idc;

    private String clusterId;

    private String networkArea;

    private String podGroupTag;

    private Double torHaLimit = 0.5;

    private ContainerResource containerResource;

    private PodInfoDTO podTemplate;

    public ContainerResource getContainerResource() {
        return containerResource;
    }

    public void setContainerResource(ContainerResource containerResource) {
        this.containerResource = containerResource;
    }

    public PodInfoDTO getPodTemplate() {
        return podTemplate;
    }

    public void setPodTemplate(PodInfoDTO podTemplate) {
        this.podTemplate = podTemplate;
    }

    /**
     * Generate podGroup name
     * if NORMAL_APP, return subsystem + dcn + tag
     * else return name setting
     *
     * @return
     */
    public String getName() {
        if (StringUtils.isEmpty(name) && type == PodGroupType.NormalApp) {
            name = subsystemId + "-" + dcn;
            name = StringUtils.isEmpty(podGroupTag) ? name : name + "-" + podGroupTag;
        }

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PodGroupType getType() {
        return type;
    }

    public void setType(PodGroupType type) {
        this.type = type;
    }

    public String getSubsystemId() {
        return subsystemId;
    }

    public void setSubsystemId(String subsystemId) {
        this.subsystemId = subsystemId;
    }

    public String getDcn() {
        return dcn;
    }

    public void setDcn(String dcn) {
        this.dcn = dcn;
    }

    public String getIdc() {
        return idc;
    }

    public void setIdc(String idc) {
        this.idc = idc;
    }

    public String getNetworkArea() {
        return networkArea;
    }

    public void setNetworkArea(String networkArea) {
        this.networkArea = networkArea;
    }

    public String getPodGroupTag() {
        return podGroupTag;
    }

    public void setPodGroupTag(String podGroupTag) {
        this.podGroupTag = podGroupTag;
    }

    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public Double getTorHaLimit() {
        return torHaLimit;
    }

    public void setTorHaLimit(Double torHaLimit) {
        this.torHaLimit = torHaLimit;
    }

    @Override
    public String toString() {
        return "PodGroup{" +
                "type=" + type +
                ", name='" + name + '\'' +
                ", subsystemId='" + subsystemId + '\'' +
                ", dcn='" + dcn + '\'' +
                ", idc='" + idc + '\'' +
                ", clusterId='" + clusterId + '\'' +
                ", networkArea='" + networkArea + '\'' +
                ", podGroupTag='" + podGroupTag + '\'' +
                ", containerResource=" + containerResource +
                ", podTemplate=" + podTemplate +
                '}';
    }
}
