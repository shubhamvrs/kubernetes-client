/**
 * Copyright (C) 2018 Red Hat inc.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *         http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 **/
package me.snowdrop.servicecatalog.api.client.internal;

import java.util.Map;
import java.util.TreeMap;

import me.snowdrop.servicecatalog.api.model.DoneableClusterServiceBroker;
import io.fabric8.kubernetes.client.Config;
import io.fabric8.kubernetes.client.dsl.Resource;
import io.fabric8.kubernetes.client.dsl.base.HasMetadataOperation;
import me.snowdrop.servicecatalog.api.model.ClusterServiceBroker;
import me.snowdrop.servicecatalog.api.model.ClusterServiceBrokerList;
import okhttp3.OkHttpClient;


public class ClusterServiceBrokerOperationImpl extends HasMetadataOperation<ClusterServiceBroker, ClusterServiceBrokerList, DoneableClusterServiceBroker, Resource<ClusterServiceBroker, DoneableClusterServiceBroker>> {

  public ClusterServiceBrokerOperationImpl(OkHttpClient client, Config config) {
      this(client, config, "servicecatalog.k8s.io", "v1beta1", null, null, true, null, null, false, -1, new TreeMap<String, String>(), new TreeMap<String, String>(), new TreeMap<String, String[]>(), new TreeMap<String, String[]>(), new TreeMap<String, String>());
  }

    public ClusterServiceBrokerOperationImpl(OkHttpClient client, Config config, String apiGroup, String apiVersion, String namespace, String name, Boolean cascading, ClusterServiceBroker item, String resourceVersion, Boolean reloadingFromServer, long gracePeriodSeconds, Map<String, String> labels, Map<String, String> labelsNot, Map<String, String[]> labelsIn, Map<String, String[]> labelsNotIn, Map<String, String> fields) {
    super(client, config, apiGroup, apiVersion, "clusterservicebrokers", namespace, name, cascading, item, resourceVersion, reloadingFromServer, gracePeriodSeconds, labels, labelsNot, labelsIn, labelsNotIn, fields);
  }

  @Override
  public boolean isResourceNamespaced() {
    return false;
  }

    @Override
    public Resource<ClusterServiceBroker, DoneableClusterServiceBroker> withName(String name) {
        return new ClusterServiceBrokerOperationImpl(client, config, apiGroup, apiVersion, namespace, name, isCascading(), getItem(), getResourceVersion(), isReloadingFromServer(), getGracePeriodSeconds(), getLabels(), getLabelsNot(), getLabelsIn(), getLabelsNotIn(), getFields());
    }
}
