package ru.service.home.configurations

import com.typesafe.config.Config

case class ServerConfig(host: String,
                        port: Int)

object ServerConfig {
  def apply(config: Config): ServerConfig = ServerConfig(
    host = config.getString("server.host"),
    port = config.getInt("server.port")
  )
}
