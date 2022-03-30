package com.tencent.wxcloudrun.service;

import com.tencent.wxcloudrun.model.Counter;

import java.util.Map;
import java.util.Optional;
import java.util.List;

public interface CounterService {

  Optional<Counter> getCounter(Integer id);

  List<Map<String, String>> getDatas();

  void upsertCount(Counter counter);

  void clearCount(Integer id);
}
