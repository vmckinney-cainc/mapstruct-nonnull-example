package org.example;

import lombok.Builder;
import lombok.NonNull;

@Builder
public record ParentTarget(@NonNull String childFoo) {}
