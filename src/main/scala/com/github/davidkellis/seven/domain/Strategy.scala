package com.github.davidkellis.seven.domain

import com.github.davidkellis.seven.domain.CoreTypes.TradingEvent
import org.joda.time.DateTime

trait Strategy {
  def initialize(): Unit
  def evaluate(time: DateTime, event: TradingEvent): Unit
}