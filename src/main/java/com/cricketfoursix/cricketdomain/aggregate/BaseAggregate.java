package com.cricketfoursix.cricketdomain.aggregate;

import org.springframework.data.annotation.Version;

public class BaseAggregate {
    @Version
    Long version;
}
