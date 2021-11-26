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
package cn.webank.dockin.rm.database.dto;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class PodGroupInfo implements Serializable {

    private static final long serialVersionUID = 1628860751600L;

    private String name;
    private String type;
    private Integer fixedInstance;
    private Integer totalInstance;
    private String subsystemId;
    private String dcn;
    private String idc;
    private String clusterId;
    private String podGroupTag;
    private String networkArea;
    private String containerResource;
    private java.util.Date createTime;
    private java.util.Date updateTime;

    public void setName(String name){this.name = name;}

    public String getName(){return this.name;}

    public void setType(String type){this.type = type;}

    public String getType(){return this.type;}

    public void setFixedInstance(Integer fixedInstance){this.fixedInstance = fixedInstance;}

    public Integer getFixedInstance(){return this.fixedInstance;}

    public void setTotalInstance(Integer totalInstance){this.totalInstance = totalInstance;}

    public Integer getTotalInstance(){return this.totalInstance;}

    public void setSubsystemId(String subsystemId){this.subsystemId = subsystemId;}

    public String getSubsystemId(){return this.subsystemId;}

    public void setDcn(String dcn){this.dcn = dcn;}

    public String getDcn(){return this.dcn;}

    public void setIdc(String idc){this.idc = idc;}

    public String getIdc(){return this.idc;}

    public void setClusterId(String clusterId){this.clusterId = clusterId;}

    public String getClusterId(){return this.clusterId;}

    public void setPodGroupTag(String podGroupTag){this.podGroupTag = podGroupTag;}

    public String getPodGroupTag(){return this.podGroupTag;}

    public void setNetworkArea(String networkArea){this.networkArea = networkArea;}

    public String getNetworkArea(){return this.networkArea;}

    public void setContainerResource(String containerResource){this.containerResource = containerResource;}

    public String getContainerResource(){return this.containerResource;}

    public void setCreateTime(java.util.Date createTime){this.createTime = createTime;}

    public java.util.Date getCreateTime(){return this.createTime;}

    public void setUpdateTime(java.util.Date updateTime){this.updateTime = updateTime;}

    public java.util.Date getUpdateTime(){return this.updateTime;}
    @Override
    public String toString() {
        return "PodGroupInfo{" +
                "name='" + name + '\'' +
                "type='" + type + '\'' +
                "fixedInstance='" + fixedInstance + '\'' +
                "totalInstance='" + totalInstance + '\'' +
                "subsystemId='" + subsystemId + '\'' +
                "dcn='" + dcn + '\'' +
                "idc='" + idc + '\'' +
                "clusterId='" + clusterId + '\'' +
                "podGroupTag='" + podGroupTag + '\'' +
                "networkArea='" + networkArea + '\'' +
                "containerResource='" + containerResource + '\'' +
                "createTime='" + createTime + '\'' +
                "updateTime='" + updateTime + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private PodGroupInfo set;

        private ConditionBuilder where;

        public UpdateBuilder set(PodGroupInfo set){
            this.set = set;
            return this;
        }

        public PodGroupInfo getSet(){
            return this.set;
        }

        public UpdateBuilder where(ConditionBuilder where){
            this.where = where;
            return this;
        }

        public ConditionBuilder getWhere(){
            return this.where;
        }

        public UpdateBuilder build(){
            return this;
        }
    }

    public static class QueryBuilder extends PodGroupInfo{
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){return this.fetchFields;}

        private List<String> nameList;

        public List<String> getNameList(){return this.nameList;}


        private List<String> fuzzyName;

        public List<String> getFuzzyName(){return this.fuzzyName;}

        private List<String> rightFuzzyName;

        public List<String> getRightFuzzyName(){return this.rightFuzzyName;}
        private List<String> typeList;

        public List<String> getTypeList(){return this.typeList;}


        private List<String> fuzzyType;

        public List<String> getFuzzyType(){return this.fuzzyType;}

        private List<String> rightFuzzyType;

        public List<String> getRightFuzzyType(){return this.rightFuzzyType;}
        private List<Integer> fixedInstanceList;

        public List<Integer> getFixedInstanceList(){return this.fixedInstanceList;}

        private Integer fixedInstanceSt;

        private Integer fixedInstanceEd;

        public Integer getFixedInstanceSt(){return this.fixedInstanceSt;}

        public Integer getFixedInstanceEd(){return this.fixedInstanceEd;}

        private List<Integer> totalInstanceList;

        public List<Integer> getTotalInstanceList(){return this.totalInstanceList;}

        private Integer totalInstanceSt;

        private Integer totalInstanceEd;

        public Integer getTotalInstanceSt(){return this.totalInstanceSt;}

        public Integer getTotalInstanceEd(){return this.totalInstanceEd;}

        private List<String> subsystemIdList;

        public List<String> getSubsystemIdList(){return this.subsystemIdList;}


        private List<String> fuzzySubsystemId;

        public List<String> getFuzzySubsystemId(){return this.fuzzySubsystemId;}

        private List<String> rightFuzzySubsystemId;

        public List<String> getRightFuzzySubsystemId(){return this.rightFuzzySubsystemId;}
        private List<String> dcnList;

        public List<String> getDcnList(){return this.dcnList;}


        private List<String> fuzzyDcn;

        public List<String> getFuzzyDcn(){return this.fuzzyDcn;}

        private List<String> rightFuzzyDcn;

        public List<String> getRightFuzzyDcn(){return this.rightFuzzyDcn;}
        private List<String> idcList;

        public List<String> getIdcList(){return this.idcList;}


        private List<String> fuzzyIdc;

        public List<String> getFuzzyIdc(){return this.fuzzyIdc;}

        private List<String> rightFuzzyIdc;

        public List<String> getRightFuzzyIdc(){return this.rightFuzzyIdc;}
        private List<String> clusterIdList;

        public List<String> getClusterIdList(){return this.clusterIdList;}


        private List<String> fuzzyClusterId;

        public List<String> getFuzzyClusterId(){return this.fuzzyClusterId;}

        private List<String> rightFuzzyClusterId;

        public List<String> getRightFuzzyClusterId(){return this.rightFuzzyClusterId;}
        private List<String> podGroupTagList;

        public List<String> getPodGroupTagList(){return this.podGroupTagList;}


        private List<String> fuzzyPodGroupTag;

        public List<String> getFuzzyPodGroupTag(){return this.fuzzyPodGroupTag;}

        private List<String> rightFuzzyPodGroupTag;

        public List<String> getRightFuzzyPodGroupTag(){return this.rightFuzzyPodGroupTag;}
        private List<String> networkAreaList;

        public List<String> getNetworkAreaList(){return this.networkAreaList;}


        private List<String> fuzzyNetworkArea;

        public List<String> getFuzzyNetworkArea(){return this.fuzzyNetworkArea;}

        private List<String> rightFuzzyNetworkArea;

        public List<String> getRightFuzzyNetworkArea(){return this.rightFuzzyNetworkArea;}
        private List<String> containerResourceList;

        public List<String> getContainerResourceList(){return this.containerResourceList;}


        private List<String> fuzzyContainerResource;

        public List<String> getFuzzyContainerResource(){return this.fuzzyContainerResource;}

        private List<String> rightFuzzyContainerResource;

        public List<String> getRightFuzzyContainerResource(){return this.rightFuzzyContainerResource;}
        private List<java.util.Date> createTimeList;

        public List<java.util.Date> getCreateTimeList(){return this.createTimeList;}

        private java.util.Date createTimeSt;

        private java.util.Date createTimeEd;

        public java.util.Date getCreateTimeSt(){return this.createTimeSt;}

        public java.util.Date getCreateTimeEd(){return this.createTimeEd;}

        private List<java.util.Date> updateTimeList;

        public List<java.util.Date> getUpdateTimeList(){return this.updateTimeList;}

        private java.util.Date updateTimeSt;

        private java.util.Date updateTimeEd;

        public java.util.Date getUpdateTimeSt(){return this.updateTimeSt;}

        public java.util.Date getUpdateTimeEd(){return this.updateTimeEd;}

        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
        }

        public QueryBuilder fuzzyName (List<String> fuzzyName){
            this.fuzzyName = fuzzyName;
            return this;
        }

        public QueryBuilder fuzzyName (String ... fuzzyName){
            this.fuzzyName = solveNullList(fuzzyName);
            return this;
        }

        public QueryBuilder rightFuzzyName (List<String> rightFuzzyName){
            this.rightFuzzyName = rightFuzzyName;
            return this;
        }

        public QueryBuilder rightFuzzyName (String ... rightFuzzyName){
            this.rightFuzzyName = solveNullList(rightFuzzyName);
            return this;
        }

        public QueryBuilder name(String name){
            setName(name);
            return this;
        }

        public QueryBuilder nameList(String ... name){
            this.nameList = solveNullList(name);
            return this;
        }

        public QueryBuilder nameList(List<String> name){
            this.nameList = name;
            return this;
        }

        public QueryBuilder fetchName(){
            setFetchFields("fetchFields","name");
            return this;
        }

        public QueryBuilder excludeName(){
            setFetchFields("excludeFields","name");
            return this;
        }

        public QueryBuilder fuzzyType (List<String> fuzzyType){
            this.fuzzyType = fuzzyType;
            return this;
        }

        public QueryBuilder fuzzyType (String ... fuzzyType){
            this.fuzzyType = solveNullList(fuzzyType);
            return this;
        }

        public QueryBuilder rightFuzzyType (List<String> rightFuzzyType){
            this.rightFuzzyType = rightFuzzyType;
            return this;
        }

        public QueryBuilder rightFuzzyType (String ... rightFuzzyType){
            this.rightFuzzyType = solveNullList(rightFuzzyType);
            return this;
        }

        public QueryBuilder type(String type){
            setType(type);
            return this;
        }

        public QueryBuilder typeList(String ... type){
            this.typeList = solveNullList(type);
            return this;
        }

        public QueryBuilder typeList(List<String> type){
            this.typeList = type;
            return this;
        }

        public QueryBuilder fetchType(){
            setFetchFields("fetchFields","type");
            return this;
        }

        public QueryBuilder excludeType(){
            setFetchFields("excludeFields","type");
            return this;
        }

        public QueryBuilder fixedInstanceBetWeen(Integer fixedInstanceSt,Integer fixedInstanceEd){
            this.fixedInstanceSt = fixedInstanceSt;
            this.fixedInstanceEd = fixedInstanceEd;
            return this;
        }

        public QueryBuilder fixedInstanceGreaterEqThan(Integer fixedInstanceSt){
            this.fixedInstanceSt = fixedInstanceSt;
            return this;
        }
        public QueryBuilder fixedInstanceLessEqThan(Integer fixedInstanceEd){
            this.fixedInstanceEd = fixedInstanceEd;
            return this;
        }


        public QueryBuilder fixedInstance(Integer fixedInstance){
            setFixedInstance(fixedInstance);
            return this;
        }

        public QueryBuilder fixedInstanceList(Integer ... fixedInstance){
            this.fixedInstanceList = solveNullList(fixedInstance);
            return this;
        }

        public QueryBuilder fixedInstanceList(List<Integer> fixedInstance){
            this.fixedInstanceList = fixedInstance;
            return this;
        }

        public QueryBuilder fetchFixedInstance(){
            setFetchFields("fetchFields","fixedInstance");
            return this;
        }

        public QueryBuilder excludeFixedInstance(){
            setFetchFields("excludeFields","fixedInstance");
            return this;
        }

        public QueryBuilder totalInstanceBetWeen(Integer totalInstanceSt,Integer totalInstanceEd){
            this.totalInstanceSt = totalInstanceSt;
            this.totalInstanceEd = totalInstanceEd;
            return this;
        }

        public QueryBuilder totalInstanceGreaterEqThan(Integer totalInstanceSt){
            this.totalInstanceSt = totalInstanceSt;
            return this;
        }
        public QueryBuilder totalInstanceLessEqThan(Integer totalInstanceEd){
            this.totalInstanceEd = totalInstanceEd;
            return this;
        }


        public QueryBuilder totalInstance(Integer totalInstance){
            setTotalInstance(totalInstance);
            return this;
        }

        public QueryBuilder totalInstanceList(Integer ... totalInstance){
            this.totalInstanceList = solveNullList(totalInstance);
            return this;
        }

        public QueryBuilder totalInstanceList(List<Integer> totalInstance){
            this.totalInstanceList = totalInstance;
            return this;
        }

        public QueryBuilder fetchTotalInstance(){
            setFetchFields("fetchFields","totalInstance");
            return this;
        }

        public QueryBuilder excludeTotalInstance(){
            setFetchFields("excludeFields","totalInstance");
            return this;
        }

        public QueryBuilder fuzzySubsystemId (List<String> fuzzySubsystemId){
            this.fuzzySubsystemId = fuzzySubsystemId;
            return this;
        }

        public QueryBuilder fuzzySubsystemId (String ... fuzzySubsystemId){
            this.fuzzySubsystemId = solveNullList(fuzzySubsystemId);
            return this;
        }

        public QueryBuilder rightFuzzySubsystemId (List<String> rightFuzzySubsystemId){
            this.rightFuzzySubsystemId = rightFuzzySubsystemId;
            return this;
        }

        public QueryBuilder rightFuzzySubsystemId (String ... rightFuzzySubsystemId){
            this.rightFuzzySubsystemId = solveNullList(rightFuzzySubsystemId);
            return this;
        }

        public QueryBuilder subsystemId(String subsystemId){
            setSubsystemId(subsystemId);
            return this;
        }

        public QueryBuilder subsystemIdList(String ... subsystemId){
            this.subsystemIdList = solveNullList(subsystemId);
            return this;
        }

        public QueryBuilder subsystemIdList(List<String> subsystemId){
            this.subsystemIdList = subsystemId;
            return this;
        }

        public QueryBuilder fetchSubsystemId(){
            setFetchFields("fetchFields","subsystemId");
            return this;
        }

        public QueryBuilder excludeSubsystemId(){
            setFetchFields("excludeFields","subsystemId");
            return this;
        }

        public QueryBuilder fuzzyDcn (List<String> fuzzyDcn){
            this.fuzzyDcn = fuzzyDcn;
            return this;
        }

        public QueryBuilder fuzzyDcn (String ... fuzzyDcn){
            this.fuzzyDcn = solveNullList(fuzzyDcn);
            return this;
        }

        public QueryBuilder rightFuzzyDcn (List<String> rightFuzzyDcn){
            this.rightFuzzyDcn = rightFuzzyDcn;
            return this;
        }

        public QueryBuilder rightFuzzyDcn (String ... rightFuzzyDcn){
            this.rightFuzzyDcn = solveNullList(rightFuzzyDcn);
            return this;
        }

        public QueryBuilder dcn(String dcn){
            setDcn(dcn);
            return this;
        }

        public QueryBuilder dcnList(String ... dcn){
            this.dcnList = solveNullList(dcn);
            return this;
        }

        public QueryBuilder dcnList(List<String> dcn){
            this.dcnList = dcn;
            return this;
        }

        public QueryBuilder fetchDcn(){
            setFetchFields("fetchFields","dcn");
            return this;
        }

        public QueryBuilder excludeDcn(){
            setFetchFields("excludeFields","dcn");
            return this;
        }

        public QueryBuilder fuzzyIdc (List<String> fuzzyIdc){
            this.fuzzyIdc = fuzzyIdc;
            return this;
        }

        public QueryBuilder fuzzyIdc (String ... fuzzyIdc){
            this.fuzzyIdc = solveNullList(fuzzyIdc);
            return this;
        }

        public QueryBuilder rightFuzzyIdc (List<String> rightFuzzyIdc){
            this.rightFuzzyIdc = rightFuzzyIdc;
            return this;
        }

        public QueryBuilder rightFuzzyIdc (String ... rightFuzzyIdc){
            this.rightFuzzyIdc = solveNullList(rightFuzzyIdc);
            return this;
        }

        public QueryBuilder idc(String idc){
            setIdc(idc);
            return this;
        }

        public QueryBuilder idcList(String ... idc){
            this.idcList = solveNullList(idc);
            return this;
        }

        public QueryBuilder idcList(List<String> idc){
            this.idcList = idc;
            return this;
        }

        public QueryBuilder fetchIdc(){
            setFetchFields("fetchFields","idc");
            return this;
        }

        public QueryBuilder excludeIdc(){
            setFetchFields("excludeFields","idc");
            return this;
        }

        public QueryBuilder fuzzyClusterId (List<String> fuzzyClusterId){
            this.fuzzyClusterId = fuzzyClusterId;
            return this;
        }

        public QueryBuilder fuzzyClusterId (String ... fuzzyClusterId){
            this.fuzzyClusterId = solveNullList(fuzzyClusterId);
            return this;
        }

        public QueryBuilder rightFuzzyClusterId (List<String> rightFuzzyClusterId){
            this.rightFuzzyClusterId = rightFuzzyClusterId;
            return this;
        }

        public QueryBuilder rightFuzzyClusterId (String ... rightFuzzyClusterId){
            this.rightFuzzyClusterId = solveNullList(rightFuzzyClusterId);
            return this;
        }

        public QueryBuilder clusterId(String clusterId){
            setClusterId(clusterId);
            return this;
        }

        public QueryBuilder clusterIdList(String ... clusterId){
            this.clusterIdList = solveNullList(clusterId);
            return this;
        }

        public QueryBuilder clusterIdList(List<String> clusterId){
            this.clusterIdList = clusterId;
            return this;
        }

        public QueryBuilder fetchClusterId(){
            setFetchFields("fetchFields","clusterId");
            return this;
        }

        public QueryBuilder excludeClusterId(){
            setFetchFields("excludeFields","clusterId");
            return this;
        }

        public QueryBuilder fuzzyPodGroupTag (List<String> fuzzyPodGroupTag){
            this.fuzzyPodGroupTag = fuzzyPodGroupTag;
            return this;
        }

        public QueryBuilder fuzzyPodGroupTag (String ... fuzzyPodGroupTag){
            this.fuzzyPodGroupTag = solveNullList(fuzzyPodGroupTag);
            return this;
        }

        public QueryBuilder rightFuzzyPodGroupTag (List<String> rightFuzzyPodGroupTag){
            this.rightFuzzyPodGroupTag = rightFuzzyPodGroupTag;
            return this;
        }

        public QueryBuilder rightFuzzyPodGroupTag (String ... rightFuzzyPodGroupTag){
            this.rightFuzzyPodGroupTag = solveNullList(rightFuzzyPodGroupTag);
            return this;
        }

        public QueryBuilder podGroupTag(String podGroupTag){
            setPodGroupTag(podGroupTag);
            return this;
        }

        public QueryBuilder podGroupTagList(String ... podGroupTag){
            this.podGroupTagList = solveNullList(podGroupTag);
            return this;
        }

        public QueryBuilder podGroupTagList(List<String> podGroupTag){
            this.podGroupTagList = podGroupTag;
            return this;
        }

        public QueryBuilder fetchPodGroupTag(){
            setFetchFields("fetchFields","podGroupTag");
            return this;
        }

        public QueryBuilder excludePodGroupTag(){
            setFetchFields("excludeFields","podGroupTag");
            return this;
        }

        public QueryBuilder fuzzyNetworkArea (List<String> fuzzyNetworkArea){
            this.fuzzyNetworkArea = fuzzyNetworkArea;
            return this;
        }

        public QueryBuilder fuzzyNetworkArea (String ... fuzzyNetworkArea){
            this.fuzzyNetworkArea = solveNullList(fuzzyNetworkArea);
            return this;
        }

        public QueryBuilder rightFuzzyNetworkArea (List<String> rightFuzzyNetworkArea){
            this.rightFuzzyNetworkArea = rightFuzzyNetworkArea;
            return this;
        }

        public QueryBuilder rightFuzzyNetworkArea (String ... rightFuzzyNetworkArea){
            this.rightFuzzyNetworkArea = solveNullList(rightFuzzyNetworkArea);
            return this;
        }

        public QueryBuilder networkArea(String networkArea){
            setNetworkArea(networkArea);
            return this;
        }

        public QueryBuilder networkAreaList(String ... networkArea){
            this.networkAreaList = solveNullList(networkArea);
            return this;
        }

        public QueryBuilder networkAreaList(List<String> networkArea){
            this.networkAreaList = networkArea;
            return this;
        }

        public QueryBuilder fetchNetworkArea(){
            setFetchFields("fetchFields","networkArea");
            return this;
        }

        public QueryBuilder excludeNetworkArea(){
            setFetchFields("excludeFields","networkArea");
            return this;
        }

        public QueryBuilder fuzzyContainerResource (List<String> fuzzyContainerResource){
            this.fuzzyContainerResource = fuzzyContainerResource;
            return this;
        }

        public QueryBuilder fuzzyContainerResource (String ... fuzzyContainerResource){
            this.fuzzyContainerResource = solveNullList(fuzzyContainerResource);
            return this;
        }

        public QueryBuilder rightFuzzyContainerResource (List<String> rightFuzzyContainerResource){
            this.rightFuzzyContainerResource = rightFuzzyContainerResource;
            return this;
        }

        public QueryBuilder rightFuzzyContainerResource (String ... rightFuzzyContainerResource){
            this.rightFuzzyContainerResource = solveNullList(rightFuzzyContainerResource);
            return this;
        }

        public QueryBuilder containerResource(String containerResource){
            setContainerResource(containerResource);
            return this;
        }

        public QueryBuilder containerResourceList(String ... containerResource){
            this.containerResourceList = solveNullList(containerResource);
            return this;
        }

        public QueryBuilder containerResourceList(List<String> containerResource){
            this.containerResourceList = containerResource;
            return this;
        }

        public QueryBuilder fetchContainerResource(){
            setFetchFields("fetchFields","containerResource");
            return this;
        }

        public QueryBuilder excludeContainerResource(){
            setFetchFields("excludeFields","containerResource");
            return this;
        }

        public QueryBuilder createTimeBetWeen(java.util.Date createTimeSt,java.util.Date createTimeEd){
            this.createTimeSt = createTimeSt;
            this.createTimeEd = createTimeEd;
            return this;
        }

        public QueryBuilder createTimeGreaterEqThan(java.util.Date createTimeSt){
            this.createTimeSt = createTimeSt;
            return this;
        }
        public QueryBuilder createTimeLessEqThan(java.util.Date createTimeEd){
            this.createTimeEd = createTimeEd;
            return this;
        }


        public QueryBuilder createTime(java.util.Date createTime){
            setCreateTime(createTime);
            return this;
        }

        public QueryBuilder createTimeList(java.util.Date ... createTime){
            this.createTimeList = solveNullList(createTime);
            return this;
        }

        public QueryBuilder createTimeList(List<java.util.Date> createTime){
            this.createTimeList = createTime;
            return this;
        }

        public QueryBuilder fetchCreateTime(){
            setFetchFields("fetchFields","createTime");
            return this;
        }

        public QueryBuilder excludeCreateTime(){
            setFetchFields("excludeFields","createTime");
            return this;
        }

        public QueryBuilder updateTimeBetWeen(java.util.Date updateTimeSt,java.util.Date updateTimeEd){
            this.updateTimeSt = updateTimeSt;
            this.updateTimeEd = updateTimeEd;
            return this;
        }

        public QueryBuilder updateTimeGreaterEqThan(java.util.Date updateTimeSt){
            this.updateTimeSt = updateTimeSt;
            return this;
        }
        public QueryBuilder updateTimeLessEqThan(java.util.Date updateTimeEd){
            this.updateTimeEd = updateTimeEd;
            return this;
        }


        public QueryBuilder updateTime(java.util.Date updateTime){
            setUpdateTime(updateTime);
            return this;
        }

        public QueryBuilder updateTimeList(java.util.Date ... updateTime){
            this.updateTimeList = solveNullList(updateTime);
            return this;
        }

        public QueryBuilder updateTimeList(List<java.util.Date> updateTime){
            this.updateTimeList = updateTime;
            return this;
        }

        public QueryBuilder fetchUpdateTime(){
            setFetchFields("fetchFields","updateTime");
            return this;
        }

        public QueryBuilder excludeUpdateTime(){
            setFetchFields("excludeFields","updateTime");
            return this;
        }
        private <T>List<T> solveNullList(T ... objs){
            if (objs != null){
            List<T> list = new ArrayList<>();
                for (T item : objs){
                    if (item != null){
                        list.add(item);
                    }
                }
                return list;
            }
            return null;
        }

        public QueryBuilder fetchAll(){
            this.fetchFields.put("AllFields",true);
            return this;
        }

        public QueryBuilder addField(String ... fields){
            List<String> list = new ArrayList<>();
            if (fields != null){
                for (String field : fields){
                    list.add(field);
                }
            }
            this.fetchFields.put("otherFields",list);
            return this;
        }
        @SuppressWarnings("unchecked")
        private void setFetchFields(String key,String val){
            Map<String,Boolean> fields= (Map<String, Boolean>) this.fetchFields.get(key);
            if (fields == null){
                fields = new HashMap<>();
            }
            fields.put(val,true);
            this.fetchFields.put(key,fields);
        }

        public PodGroupInfo build(){return this;}
    }


    public static class ConditionBuilder{
        private List<String> nameList;

        public List<String> getNameList(){return this.nameList;}


        private List<String> fuzzyName;

        public List<String> getFuzzyName(){return this.fuzzyName;}

        private List<String> rightFuzzyName;

        public List<String> getRightFuzzyName(){return this.rightFuzzyName;}
        private List<String> typeList;

        public List<String> getTypeList(){return this.typeList;}


        private List<String> fuzzyType;

        public List<String> getFuzzyType(){return this.fuzzyType;}

        private List<String> rightFuzzyType;

        public List<String> getRightFuzzyType(){return this.rightFuzzyType;}
        private List<Integer> fixedInstanceList;

        public List<Integer> getFixedInstanceList(){return this.fixedInstanceList;}

        private Integer fixedInstanceSt;

        private Integer fixedInstanceEd;

        public Integer getFixedInstanceSt(){return this.fixedInstanceSt;}

        public Integer getFixedInstanceEd(){return this.fixedInstanceEd;}

        private List<Integer> totalInstanceList;

        public List<Integer> getTotalInstanceList(){return this.totalInstanceList;}

        private Integer totalInstanceSt;

        private Integer totalInstanceEd;

        public Integer getTotalInstanceSt(){return this.totalInstanceSt;}

        public Integer getTotalInstanceEd(){return this.totalInstanceEd;}

        private List<String> subsystemIdList;

        public List<String> getSubsystemIdList(){return this.subsystemIdList;}


        private List<String> fuzzySubsystemId;

        public List<String> getFuzzySubsystemId(){return this.fuzzySubsystemId;}

        private List<String> rightFuzzySubsystemId;

        public List<String> getRightFuzzySubsystemId(){return this.rightFuzzySubsystemId;}
        private List<String> dcnList;

        public List<String> getDcnList(){return this.dcnList;}


        private List<String> fuzzyDcn;

        public List<String> getFuzzyDcn(){return this.fuzzyDcn;}

        private List<String> rightFuzzyDcn;

        public List<String> getRightFuzzyDcn(){return this.rightFuzzyDcn;}
        private List<String> idcList;

        public List<String> getIdcList(){return this.idcList;}


        private List<String> fuzzyIdc;

        public List<String> getFuzzyIdc(){return this.fuzzyIdc;}

        private List<String> rightFuzzyIdc;

        public List<String> getRightFuzzyIdc(){return this.rightFuzzyIdc;}
        private List<String> clusterIdList;

        public List<String> getClusterIdList(){return this.clusterIdList;}


        private List<String> fuzzyClusterId;

        public List<String> getFuzzyClusterId(){return this.fuzzyClusterId;}

        private List<String> rightFuzzyClusterId;

        public List<String> getRightFuzzyClusterId(){return this.rightFuzzyClusterId;}
        private List<String> podGroupTagList;

        public List<String> getPodGroupTagList(){return this.podGroupTagList;}


        private List<String> fuzzyPodGroupTag;

        public List<String> getFuzzyPodGroupTag(){return this.fuzzyPodGroupTag;}

        private List<String> rightFuzzyPodGroupTag;

        public List<String> getRightFuzzyPodGroupTag(){return this.rightFuzzyPodGroupTag;}
        private List<String> networkAreaList;

        public List<String> getNetworkAreaList(){return this.networkAreaList;}


        private List<String> fuzzyNetworkArea;

        public List<String> getFuzzyNetworkArea(){return this.fuzzyNetworkArea;}

        private List<String> rightFuzzyNetworkArea;

        public List<String> getRightFuzzyNetworkArea(){return this.rightFuzzyNetworkArea;}
        private List<String> containerResourceList;

        public List<String> getContainerResourceList(){return this.containerResourceList;}


        private List<String> fuzzyContainerResource;

        public List<String> getFuzzyContainerResource(){return this.fuzzyContainerResource;}

        private List<String> rightFuzzyContainerResource;

        public List<String> getRightFuzzyContainerResource(){return this.rightFuzzyContainerResource;}
        private List<java.util.Date> createTimeList;

        public List<java.util.Date> getCreateTimeList(){return this.createTimeList;}

        private java.util.Date createTimeSt;

        private java.util.Date createTimeEd;

        public java.util.Date getCreateTimeSt(){return this.createTimeSt;}

        public java.util.Date getCreateTimeEd(){return this.createTimeEd;}

        private List<java.util.Date> updateTimeList;

        public List<java.util.Date> getUpdateTimeList(){return this.updateTimeList;}

        private java.util.Date updateTimeSt;

        private java.util.Date updateTimeEd;

        public java.util.Date getUpdateTimeSt(){return this.updateTimeSt;}

        public java.util.Date getUpdateTimeEd(){return this.updateTimeEd;}


        public ConditionBuilder fuzzyName (List<String> fuzzyName){
            this.fuzzyName = fuzzyName;
            return this;
        }

        public ConditionBuilder fuzzyName (String ... fuzzyName){
            this.fuzzyName = solveNullList(fuzzyName);
            return this;
        }

        public ConditionBuilder rightFuzzyName (List<String> rightFuzzyName){
            this.rightFuzzyName = rightFuzzyName;
            return this;
        }

        public ConditionBuilder rightFuzzyName (String ... rightFuzzyName){
            this.rightFuzzyName = solveNullList(rightFuzzyName);
            return this;
        }

        public ConditionBuilder nameList(String ... name){
            this.nameList = solveNullList(name);
            return this;
        }

        public ConditionBuilder nameList(List<String> name){
            this.nameList = name;
            return this;
        }

        public ConditionBuilder fuzzyType (List<String> fuzzyType){
            this.fuzzyType = fuzzyType;
            return this;
        }

        public ConditionBuilder fuzzyType (String ... fuzzyType){
            this.fuzzyType = solveNullList(fuzzyType);
            return this;
        }

        public ConditionBuilder rightFuzzyType (List<String> rightFuzzyType){
            this.rightFuzzyType = rightFuzzyType;
            return this;
        }

        public ConditionBuilder rightFuzzyType (String ... rightFuzzyType){
            this.rightFuzzyType = solveNullList(rightFuzzyType);
            return this;
        }

        public ConditionBuilder typeList(String ... type){
            this.typeList = solveNullList(type);
            return this;
        }

        public ConditionBuilder typeList(List<String> type){
            this.typeList = type;
            return this;
        }

        public ConditionBuilder fixedInstanceBetWeen(Integer fixedInstanceSt,Integer fixedInstanceEd){
            this.fixedInstanceSt = fixedInstanceSt;
            this.fixedInstanceEd = fixedInstanceEd;
            return this;
        }

        public ConditionBuilder fixedInstanceGreaterEqThan(Integer fixedInstanceSt){
            this.fixedInstanceSt = fixedInstanceSt;
            return this;
        }
        public ConditionBuilder fixedInstanceLessEqThan(Integer fixedInstanceEd){
            this.fixedInstanceEd = fixedInstanceEd;
            return this;
        }


        public ConditionBuilder fixedInstanceList(Integer ... fixedInstance){
            this.fixedInstanceList = solveNullList(fixedInstance);
            return this;
        }

        public ConditionBuilder fixedInstanceList(List<Integer> fixedInstance){
            this.fixedInstanceList = fixedInstance;
            return this;
        }

        public ConditionBuilder totalInstanceBetWeen(Integer totalInstanceSt,Integer totalInstanceEd){
            this.totalInstanceSt = totalInstanceSt;
            this.totalInstanceEd = totalInstanceEd;
            return this;
        }

        public ConditionBuilder totalInstanceGreaterEqThan(Integer totalInstanceSt){
            this.totalInstanceSt = totalInstanceSt;
            return this;
        }
        public ConditionBuilder totalInstanceLessEqThan(Integer totalInstanceEd){
            this.totalInstanceEd = totalInstanceEd;
            return this;
        }


        public ConditionBuilder totalInstanceList(Integer ... totalInstance){
            this.totalInstanceList = solveNullList(totalInstance);
            return this;
        }

        public ConditionBuilder totalInstanceList(List<Integer> totalInstance){
            this.totalInstanceList = totalInstance;
            return this;
        }

        public ConditionBuilder fuzzySubsystemId (List<String> fuzzySubsystemId){
            this.fuzzySubsystemId = fuzzySubsystemId;
            return this;
        }

        public ConditionBuilder fuzzySubsystemId (String ... fuzzySubsystemId){
            this.fuzzySubsystemId = solveNullList(fuzzySubsystemId);
            return this;
        }

        public ConditionBuilder rightFuzzySubsystemId (List<String> rightFuzzySubsystemId){
            this.rightFuzzySubsystemId = rightFuzzySubsystemId;
            return this;
        }

        public ConditionBuilder rightFuzzySubsystemId (String ... rightFuzzySubsystemId){
            this.rightFuzzySubsystemId = solveNullList(rightFuzzySubsystemId);
            return this;
        }

        public ConditionBuilder subsystemIdList(String ... subsystemId){
            this.subsystemIdList = solveNullList(subsystemId);
            return this;
        }

        public ConditionBuilder subsystemIdList(List<String> subsystemId){
            this.subsystemIdList = subsystemId;
            return this;
        }

        public ConditionBuilder fuzzyDcn (List<String> fuzzyDcn){
            this.fuzzyDcn = fuzzyDcn;
            return this;
        }

        public ConditionBuilder fuzzyDcn (String ... fuzzyDcn){
            this.fuzzyDcn = solveNullList(fuzzyDcn);
            return this;
        }

        public ConditionBuilder rightFuzzyDcn (List<String> rightFuzzyDcn){
            this.rightFuzzyDcn = rightFuzzyDcn;
            return this;
        }

        public ConditionBuilder rightFuzzyDcn (String ... rightFuzzyDcn){
            this.rightFuzzyDcn = solveNullList(rightFuzzyDcn);
            return this;
        }

        public ConditionBuilder dcnList(String ... dcn){
            this.dcnList = solveNullList(dcn);
            return this;
        }

        public ConditionBuilder dcnList(List<String> dcn){
            this.dcnList = dcn;
            return this;
        }

        public ConditionBuilder fuzzyIdc (List<String> fuzzyIdc){
            this.fuzzyIdc = fuzzyIdc;
            return this;
        }

        public ConditionBuilder fuzzyIdc (String ... fuzzyIdc){
            this.fuzzyIdc = solveNullList(fuzzyIdc);
            return this;
        }

        public ConditionBuilder rightFuzzyIdc (List<String> rightFuzzyIdc){
            this.rightFuzzyIdc = rightFuzzyIdc;
            return this;
        }

        public ConditionBuilder rightFuzzyIdc (String ... rightFuzzyIdc){
            this.rightFuzzyIdc = solveNullList(rightFuzzyIdc);
            return this;
        }

        public ConditionBuilder idcList(String ... idc){
            this.idcList = solveNullList(idc);
            return this;
        }

        public ConditionBuilder idcList(List<String> idc){
            this.idcList = idc;
            return this;
        }

        public ConditionBuilder fuzzyClusterId (List<String> fuzzyClusterId){
            this.fuzzyClusterId = fuzzyClusterId;
            return this;
        }

        public ConditionBuilder fuzzyClusterId (String ... fuzzyClusterId){
            this.fuzzyClusterId = solveNullList(fuzzyClusterId);
            return this;
        }

        public ConditionBuilder rightFuzzyClusterId (List<String> rightFuzzyClusterId){
            this.rightFuzzyClusterId = rightFuzzyClusterId;
            return this;
        }

        public ConditionBuilder rightFuzzyClusterId (String ... rightFuzzyClusterId){
            this.rightFuzzyClusterId = solveNullList(rightFuzzyClusterId);
            return this;
        }

        public ConditionBuilder clusterIdList(String ... clusterId){
            this.clusterIdList = solveNullList(clusterId);
            return this;
        }

        public ConditionBuilder clusterIdList(List<String> clusterId){
            this.clusterIdList = clusterId;
            return this;
        }

        public ConditionBuilder fuzzyPodGroupTag (List<String> fuzzyPodGroupTag){
            this.fuzzyPodGroupTag = fuzzyPodGroupTag;
            return this;
        }

        public ConditionBuilder fuzzyPodGroupTag (String ... fuzzyPodGroupTag){
            this.fuzzyPodGroupTag = solveNullList(fuzzyPodGroupTag);
            return this;
        }

        public ConditionBuilder rightFuzzyPodGroupTag (List<String> rightFuzzyPodGroupTag){
            this.rightFuzzyPodGroupTag = rightFuzzyPodGroupTag;
            return this;
        }

        public ConditionBuilder rightFuzzyPodGroupTag (String ... rightFuzzyPodGroupTag){
            this.rightFuzzyPodGroupTag = solveNullList(rightFuzzyPodGroupTag);
            return this;
        }

        public ConditionBuilder podGroupTagList(String ... podGroupTag){
            this.podGroupTagList = solveNullList(podGroupTag);
            return this;
        }

        public ConditionBuilder podGroupTagList(List<String> podGroupTag){
            this.podGroupTagList = podGroupTag;
            return this;
        }

        public ConditionBuilder fuzzyNetworkArea (List<String> fuzzyNetworkArea){
            this.fuzzyNetworkArea = fuzzyNetworkArea;
            return this;
        }

        public ConditionBuilder fuzzyNetworkArea (String ... fuzzyNetworkArea){
            this.fuzzyNetworkArea = solveNullList(fuzzyNetworkArea);
            return this;
        }

        public ConditionBuilder rightFuzzyNetworkArea (List<String> rightFuzzyNetworkArea){
            this.rightFuzzyNetworkArea = rightFuzzyNetworkArea;
            return this;
        }

        public ConditionBuilder rightFuzzyNetworkArea (String ... rightFuzzyNetworkArea){
            this.rightFuzzyNetworkArea = solveNullList(rightFuzzyNetworkArea);
            return this;
        }

        public ConditionBuilder networkAreaList(String ... networkArea){
            this.networkAreaList = solveNullList(networkArea);
            return this;
        }

        public ConditionBuilder networkAreaList(List<String> networkArea){
            this.networkAreaList = networkArea;
            return this;
        }

        public ConditionBuilder fuzzyContainerResource (List<String> fuzzyContainerResource){
            this.fuzzyContainerResource = fuzzyContainerResource;
            return this;
        }

        public ConditionBuilder fuzzyContainerResource (String ... fuzzyContainerResource){
            this.fuzzyContainerResource = solveNullList(fuzzyContainerResource);
            return this;
        }

        public ConditionBuilder rightFuzzyContainerResource (List<String> rightFuzzyContainerResource){
            this.rightFuzzyContainerResource = rightFuzzyContainerResource;
            return this;
        }

        public ConditionBuilder rightFuzzyContainerResource (String ... rightFuzzyContainerResource){
            this.rightFuzzyContainerResource = solveNullList(rightFuzzyContainerResource);
            return this;
        }

        public ConditionBuilder containerResourceList(String ... containerResource){
            this.containerResourceList = solveNullList(containerResource);
            return this;
        }

        public ConditionBuilder containerResourceList(List<String> containerResource){
            this.containerResourceList = containerResource;
            return this;
        }

        public ConditionBuilder createTimeBetWeen(java.util.Date createTimeSt,java.util.Date createTimeEd){
            this.createTimeSt = createTimeSt;
            this.createTimeEd = createTimeEd;
            return this;
        }

        public ConditionBuilder createTimeGreaterEqThan(java.util.Date createTimeSt){
            this.createTimeSt = createTimeSt;
            return this;
        }
        public ConditionBuilder createTimeLessEqThan(java.util.Date createTimeEd){
            this.createTimeEd = createTimeEd;
            return this;
        }


        public ConditionBuilder createTimeList(java.util.Date ... createTime){
            this.createTimeList = solveNullList(createTime);
            return this;
        }

        public ConditionBuilder createTimeList(List<java.util.Date> createTime){
            this.createTimeList = createTime;
            return this;
        }

        public ConditionBuilder updateTimeBetWeen(java.util.Date updateTimeSt,java.util.Date updateTimeEd){
            this.updateTimeSt = updateTimeSt;
            this.updateTimeEd = updateTimeEd;
            return this;
        }

        public ConditionBuilder updateTimeGreaterEqThan(java.util.Date updateTimeSt){
            this.updateTimeSt = updateTimeSt;
            return this;
        }
        public ConditionBuilder updateTimeLessEqThan(java.util.Date updateTimeEd){
            this.updateTimeEd = updateTimeEd;
            return this;
        }


        public ConditionBuilder updateTimeList(java.util.Date ... updateTime){
            this.updateTimeList = solveNullList(updateTime);
            return this;
        }

        public ConditionBuilder updateTimeList(List<java.util.Date> updateTime){
            this.updateTimeList = updateTime;
            return this;
        }

        private <T>List<T> solveNullList(T ... objs){
            if (objs != null){
            List<T> list = new ArrayList<>();
                for (T item : objs){
                    if (item != null){
                        list.add(item);
                    }
                }
                return list;
            }
            return null;
        }

        public ConditionBuilder build(){return this;}
    }

    public static class Builder {

        private PodGroupInfo obj;

        public Builder(){
            this.obj = new PodGroupInfo();
        }

        public Builder name(String name){
            this.obj.setName(name);
            return this;
        }
        public Builder type(String type){
            this.obj.setType(type);
            return this;
        }
        public Builder fixedInstance(Integer fixedInstance){
            this.obj.setFixedInstance(fixedInstance);
            return this;
        }
        public Builder totalInstance(Integer totalInstance){
            this.obj.setTotalInstance(totalInstance);
            return this;
        }
        public Builder subsystemId(String subsystemId){
            this.obj.setSubsystemId(subsystemId);
            return this;
        }
        public Builder dcn(String dcn){
            this.obj.setDcn(dcn);
            return this;
        }
        public Builder idc(String idc){
            this.obj.setIdc(idc);
            return this;
        }
        public Builder clusterId(String clusterId){
            this.obj.setClusterId(clusterId);
            return this;
        }
        public Builder podGroupTag(String podGroupTag){
            this.obj.setPodGroupTag(podGroupTag);
            return this;
        }
        public Builder networkArea(String networkArea){
            this.obj.setNetworkArea(networkArea);
            return this;
        }
        public Builder containerResource(String containerResource){
            this.obj.setContainerResource(containerResource);
            return this;
        }
        public Builder createTime(java.util.Date createTime){
            this.obj.setCreateTime(createTime);
            return this;
        }
        public Builder updateTime(java.util.Date updateTime){
            this.obj.setUpdateTime(updateTime);
            return this;
        }
        public PodGroupInfo build(){return obj;}
    }

}
