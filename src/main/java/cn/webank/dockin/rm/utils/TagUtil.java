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
package cn.webank.dockin.rm.utils;

import cn.webank.dockin.rm.bean.tag.Tag;
import cn.webank.dockin.rm.common.SystemTag;
import cn.webank.dockin.rm.common.TagType;
import cn.webank.dockin.rm.database.dto.HostInfo;
import cn.webank.dockin.rm.database.dto.PodInfoDTO;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import org.apache.commons.lang3.StringUtils;

import java.util.*;

/**
 * sorted tag
 */
public class TagUtil {

    public static Set<String> getHashSet(String tag) {
        return StringUtils.isEmpty(tag) ? new HashSet<>() : Sets.newHashSet(tag.split(";"));
    }

    public static void addTag(PodInfoDTO podInfoDTO, TagType type, String value) {
        String newTag = podInfoDTO.getTag() == null ? "" : podInfoDTO.getTag();

        podInfoDTO.setTag(new Tag(newTag) {{
            addTagValue(type, value);
        }}.toString());
    }

    public static void addTag(HostInfo hostInfo, TagType type, String value) {
        String newTag = hostInfo.getTag() == null ? "" : hostInfo.getTag();
        hostInfo.setTag(new Tag(newTag) {{
            addTagValue(type, value);
        }}.toString());
    }

    public static void removeTag(PodInfoDTO podInfoDTO, TagType type, String value) {
        String newTag = podInfoDTO.getTag() == null ? "" : podInfoDTO.getTag();

        podInfoDTO.setTag(new Tag(newTag) {{
            removeTagValue(type, value);
        }}.toString());
    }

    public static void removeTag(HostInfo hostInfo, TagType type, String value) {
        String newTag = hostInfo.getTag() == null ? "" : hostInfo.getTag();
        hostInfo.setTag(new Tag(newTag) {{
            removeTagValue(type, value);
        }}.toString());
    }

    public static String toTagString(String tag) {
        if (StringUtils.isEmpty(tag)) {
            return tag;
        }
        return new Tag(tag).toString();
    }

    public static String toTagValues(Set<String> values) {
        if (values == null || values.isEmpty()) {
            return "";
        }
        List<String> tagList = new ArrayList<String>(values);
        Collections.sort(tagList);
        StringBuilder sb = new StringBuilder();
        tagList.forEach(tag -> {
            if (!StringUtils.isEmpty(tag)) {
                sb.append(tag).append(",");
            }
        });
        return sb.substring(0, sb.length() - 1);
    }

    public static String toTagString(Set<String> tagSet) {
        if (tagSet == null || tagSet.isEmpty()) {
            return "";
        }
        List<String> tagList = new ArrayList<String>(tagSet);
        Collections.sort(tagList);
        StringBuilder sb = new StringBuilder();
        tagList.forEach(tag -> {
            if (!StringUtils.isEmpty(tag)) {
                sb.append(tag).append(";");
            }
        });
        return sb.toString();
    }

    public static List<String> getMainteStatus(String tag) {
        List<String> statusList = Lists.newArrayList();

        List<String> sysTag = getSystemTag(tag);
        if (sysTag != null && sysTag.size() > 0 && sysTag.contains(SystemTag.Maintenance.name())) {
            statusList.add(SystemTag.Maintenance.getMainteStatus());
        }
        return statusList;
    }

    public static List<String> getUserDefinedTag(String tag) {
        if (StringUtils.isEmpty(tag)) {
            return null;
        }

        Set<String> tagSet = new Tag(tag).getUserDefinedTags();
        return (tagSet != null && tagSet.size() > 0) ? new ArrayList<>(tagSet) : null;
    }

    public static List<String> getSystemTag(String tag) {
        if (StringUtils.isEmpty(tag)) {
            return null;
        }

        Set<String> tagSet = new Tag(tag).getSystemTags();
        return (tagSet != null && tagSet.size() > 0) ? new ArrayList<>(tagSet) : null;
    }

    public static String getPodGroupTag(String tag) {
        if (StringUtils.isEmpty(tag)) {
            return null;
        }

        Set<String> tagSet = new Tag(tag).getPodGroupTags();
        return (tagSet != null && tagSet.size() > 0) ? tagSet.stream().findFirst().get() : null;
    }

    public static Set<String> getValueSet(String tagValue) {
        if (StringUtils.isEmpty(tagValue)) {
            return null;
        }

        return new HashSet<>(Lists.newArrayList(tagValue.split(",")));
    }
}
