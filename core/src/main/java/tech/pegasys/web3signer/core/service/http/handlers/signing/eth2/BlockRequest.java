/*
 * Copyright 2020 ConsenSys AG.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package tech.pegasys.web3signer.core.service.http.handlers.signing.eth2;

import tech.pegasys.teku.api.schema.BeaconBlock;
import tech.pegasys.teku.spec.SpecMilestone;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BlockRequest {
  private final SpecMilestone version;
  private final BeaconBlock beaconBlock;

  public BlockRequest(
      @JsonProperty("version") final SpecMilestone version,
      @JsonProperty("block") final BeaconBlock beaconBlock) {
    this.version = version;
    this.beaconBlock = beaconBlock;
  }

  @JsonProperty("version")
  public SpecMilestone getVersion() {
    return version;
  }

  @JsonProperty("block")
  public BeaconBlock getBeaconBlock() {
    return beaconBlock;
  }
}
