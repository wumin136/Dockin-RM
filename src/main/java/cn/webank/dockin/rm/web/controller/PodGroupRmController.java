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
package cn.webank.dockin.rm.web.controller;

import cn.webank.dockin.rm.bean.biz.ResultDto;
import cn.webank.dockin.rm.bean.podgroup.GetPodGroupListRequest;
import cn.webank.dockin.rm.bean.podgroup.PodGroup;
import cn.webank.dockin.rm.database.dto.PodGroupInfo;
import cn.webank.dockin.rm.service.PodGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.async.DeferredResult;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
@Validated
@RequestMapping("/rmController/podGroup")
public class PodGroupRmController extends AuthBaseController {

    public static final long EXEC_TIMEOUT = 100 * 1000;

    @Autowired
    private PodGroupService podGroupService;

    /**
     * list pod group
     *
     * @param request
     * @return
     */
    @RequestMapping(value = "/getPodGroupList", method = RequestMethod.GET)
    @ResponseBody
    public DeferredResult<ResultDto<List<PodGroupInfo>>> getPodGroupList(final HttpServletRequest httpRequest, final
    HttpServletResponse httpResponse, GetPodGroupListRequest request) {
        return execute(httpRequest, httpResponse, request, EXEC_TIMEOUT, ((requestDto, bizErrors) -> podGroupService
                .getPodGroupList(request)), null, null);
    }

    /**
     * update or insert pod group
     *
     * @param request
     * @return
     */
    @RequestMapping(value = "/savePodGroup", method = RequestMethod.POST)
    @ResponseBody
    public DeferredResult<ResultDto<PodGroupInfo>> savePodGroup(final HttpServletRequest httpRequest, final
    HttpServletResponse httpResponse, @RequestBody @Validated PodGroup request) {
        return execute(httpRequest, httpResponse, request, EXEC_TIMEOUT, ((requestDto, bizErrors) -> podGroupService
                .savePodGroup(request)), null, null);
    }

    /**
     * sync pod group, use for init
     *
     * @return
     */
    @RequestMapping(value = "/syncPodGroup", method = RequestMethod.GET)
    @ResponseBody
    public DeferredResult<ResultDto<Integer>> syncPodGroup(final HttpServletRequest httpRequest, final
    HttpServletResponse httpResponse) {
        return execute(httpRequest, httpResponse, null, EXEC_TIMEOUT, ((requestDto, bizErrors) -> podGroupService
                .syncPodGroup()), null, null);
    }

    /**
     * get all podGroup name
     *
     * @return
     */
    @RequestMapping(value = "/getPodGroupNameList", method = RequestMethod.GET)
    @ResponseBody
    public DeferredResult<ResultDto<List<String>>> getPodGroupNameList(final HttpServletRequest httpRequest, final
    HttpServletResponse httpResponse) {
        return execute(httpRequest, httpResponse, null, EXEC_TIMEOUT, ((requestDto, bizErrors) -> podGroupService
                .getPodGroupNameList()), null, null);
    }
}