/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.polaris.service.catalog.iceberg;

import io.quarkus.test.junit.QuarkusTest;
import io.quarkus.test.junit.TestProfile;
import org.apache.polaris.service.Profiles;
import org.junit.jupiter.api.Test;

@QuarkusTest
@TestProfile(Profiles.PolarisAuthzBaseProfile.class)
public class IcebergCatalogHandlerAuthzTest extends AbstractIcebergCatalogHandlerAuthzTest {

  @Test
  void testEntityLevelListFilteringEnabled_filtersUnauthorizedNamespaces() {
    verifyEntityLevelListFilteringEnabled_filtersUnauthorizedNamespaces();
  }

  @Test
  void testEntityLevelListFilteringEnabled_filtersUnauthorizedTables() {
    verifyEntityLevelListFilteringEnabled_filtersUnauthorizedTables();
  }

  @Test
  void testEntityLevelListFilteringEnabled_filtersUnauthorizedViews() {
    verifyEntityLevelListFilteringEnabled_filtersUnauthorizedViews();
  }

  @Test
  void testEntityLevelListFilteringEnabled_filtersUnauthorizedNamespaces_paginated() {
    verifyEntityLevelListFilteringEnabled_filtersUnauthorizedNamespaces_paginated();
  }

  @Test
  void testEntityLevelListFilteringEnabled_filtersUnauthorizedTables_paginated() {
    verifyEntityLevelListFilteringEnabled_filtersUnauthorizedTables_paginated();
  }

  @Test
  void testEntityLevelListFilteringEnabled_filtersUnauthorizedViews_paginated() {
    verifyEntityLevelListFilteringEnabled_filtersUnauthorizedViews_paginated();
  }

  @Test
  void testEntityLevelListFilteringDisabled_returnsAllEntities() {
    verifyEntityLevelListFilteringDisabled_returnsAllEntities();
  }

  @Test
  void testEntityLevelListFilteringEnabled_federatedListTables_filtersUnauthorized()
      throws Exception {
    verifyEntityLevelListFilteringEnabled_federatedListTables_filtersUnauthorized();
  }

  @Test
  void testEntityLevelListFilteringEnabled_federatedListViews_filtersUnauthorized()
      throws Exception {
    verifyEntityLevelListFilteringEnabled_federatedListViews_filtersUnauthorized();
  }

  @Test
  void testEntityLevelListFilteringEnabled_federatedListNamespaces_filtersUnauthorized()
      throws Exception {
    verifyEntityLevelListFilteringEnabled_federatedListNamespaces_filtersUnauthorized();
  }
}
