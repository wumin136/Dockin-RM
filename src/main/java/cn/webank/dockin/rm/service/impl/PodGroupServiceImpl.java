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
package cn.webank.dockin.rm.service.impl;

import cn.webank.dockin.rm.bean.biz.ResultDto;
import cn.webank.dockin.rm.bean.podgroup.GetPodGroupListRequest;
import cn.webank.dockin.rm.bean.podgroup.PodGroup;
import cn.webank.dockin.rm.database.dao.PodGroupInfoMapper;
import cn.webank.dockin.rm.database.dao.PodInfoDAO;
import cn.webank.dockin.rm.database.dto.PodGroupInfo;
import cn.webank.dockin.rm.service.PodGroupService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PodGroupServiceImpl implements PodGroupService {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    PodGroupInfoMapper podGroupInfoMapper;

    @Autowired
    PodInfoDAO podInfoDAO;

    @Override
    public ResultDto<List<PodGroupInfo>> getPodGroupList(GetPodGroupListRequest request) {
        List<PodGroupInfo> result = null;

        if (request.getPodGroup() != null) {
            PodGroupInfo podGroupInfo = new PodGroupInfo() {{
                String name = request.getPodGroup().getName();
                if (name.contains("null")) {
                    setName(null);
                }
                else {
                    setName(name);
                }
                setSubsystemId(request.getPodGroup().getSubsystemId());
            }};

            result = podGroupInfoMapper.queryPodGroupInfo(podGroupInfo);
            return ResultDto.newSuccessResult("success", result);
        }

        if (request.getPage() != null) {
            result = podGroupInfoMapper.getByPage(new PodGroupInfo(), request.getPage());
        } else {
            result = podGroupInfoMapper.queryPodGroupInfo(new PodGroupInfo());
        }

        return ResultDto.newSuccessResult("success", result);
    }

    @Override
    public ResultDto<PodGroupInfo> savePodGroup(PodGroup request) {
//        try {
//            String podGroupName = request.getName();
//            Assert.hasLength(podGroupName, "podGroup name can not be empty");
//
//            List<PodInfoDTO> podInfoList = podInfoDAO.getPodListByOwnerReferences(podGroupName);
//            int totalInstance = podInfoList.size();
//            int fixedInstance = (int) podInfoList.stream().filter(podInfoDTO -> podInfoDTO.getExpiryType().equals(PodExpiryType.LONG_TERM.getValue())).count();
//
//            PodGroupInfo podGroupInfo = parse(request);
//            podGroupInfo.setFixedInstance(fixedInstance);
//            podGroupInfo.setTotalInstance(totalInstance);
//
//            PodGroupInfo dbPodGroupInfo = podGroupInfoMapper.queryPodGroupInfoLimit1(new PodGroupInfo() {{
//                setName(podGroupName);
//            }});
//
//            if (dbPodGroupInfo == null) {
//                podGroupInfoMapper.insertPodGroupInfo(podGroupInfo);
//            } else {
//                podGroupInfoMapper.updatePodGroupInfo(podGroupInfo);
//            }
//
//            return ResultDto.newSuccessResult("success", podGroupInfo);
//        } catch (Exception e) {
//            logger.warn("savePodGroup exception", e);
//            return ResultDto.newDefaultFailedResult("exception:" + e.getMessage());
//        }
        return null;
    }

    @Override
    public ResultDto syncPodGroup() {
//        int count = 0;
//        try {
//            Set<String> subsystemIds = podInfoDAO.getAllSubSystemId();
//            for (String subsystemId : subsystemIds) {
//                if (StringUtils.isEmpty(subsystemId)) {
//                    continue;
//                }
//                List<PodInfoDTO> podList = podInfoDAO.getPodInfoBySubsystem(subsystemId);
//                for (PodInfoDTO pod : podList) {
//                    PodGroup podGroup = new PodGroup();
//                    if (pod.getType().equals(PodGroupType.NodeAgent.name())) {
//                        continue;
//                    }
//                    if (StringUtils.isEmpty(pod.getOwnerReferences())) {  // normal app
//                        podGroup.setClusterId(null);  // normal app not set clusterId
//                        podGroup.setSubsystemId(pod.getSubSystemId());
//                        podGroup.setDcn(pod.getDcn());
//                        podGroup.setPodGroupTag(TagUtil.getPodGroupTag(pod.getTag()));
//                        podGroup.setContainerResource(new ContainerResource() {{
//                            setMemory(pod.getMem());
//                            setCpu(pod.getCpu());
//                            setDisk(pod.getDisk());
//                        }});
//                        pod.setOwnerReferences(podGroup.getName());
//                        podInfoDAO.updatePodInfo(pod);
//                        savePodGroup(podGroup);
//                        ++count;
//                    }
//                }
//            }
//        } catch (Exception e) {
//            logger.warn("syncPodGroup exception", e);
//            return ResultDto.newDefaultFailedResult("exception:" + e.getMessage());
//        }
//
//        return ResultDto.newSuccessResult("success", count);
        return null;
    }

//    public static PodGroupInfo parse(PodGroup podGroup) {
//        return new PodGroupInfo() {{
//            setName(podGroup.getName());
//            setDcn(podGroup.getDcn());
//            setIdc(podGroup.getIdc());
//            setPodGroupTag(podGroup.getPodGroupTag());
//            setClusterId(podGroup.getClusterId());
//            setNetworkArea(podGroup.getNetworkArea());
//            setSubsystemId(podGroup.getSubsystemId());
//            if (podGroup.getContainerResource() != null) {
//                setContainerResource(JsonUtil.toJson(podGroup.getContainerResource()));
//            }
//            if (podGroup.getType() != null) {
//                setType(podGroup.getType().name());
//            }
//        }};
//    }

    @Override
    public ResultDto<List<String>> getPodGroupNameList() {
        try {
            List<String> result = podGroupInfoMapper.queryPodGroupNameList();
            return ResultDto.newSuccessResult("success", result);
        } catch (Exception e) {
            logger.warn("exception occur while getting pod group name list", e);
            return ResultDto.newDefaultFailedResult("exception:" + e.getMessage());
        }
    }
}
