package org.example;

import lombok.NonNull;

public record ParentSource(@NonNull ChildSource child) {}
