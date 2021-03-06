/*
 * Copyright 2013 Toshiyuki Takahashi
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.flywaydb.play

case class FlywayConfiguration(
  database: DatabaseConfiguration,
  validateOnStart: Boolean,
  auto: Boolean,
  initOnMigrate: Option[Boolean],
  validateOnMigrate: Option[Boolean],
  encoding: Option[String],
  placeholderPrefix: Option[String],
  placeholderSuffix: Option[String],
  placeholders: Map[String, String],
  outOfOrder: Option[Boolean],
  schemas: Seq[String],
  locations: Seq[String],
  sqlMigrationPrefix: Option[String])

case class DatabaseConfiguration(
  driver: String,
  url: String,
  user: String,
  password: String)
