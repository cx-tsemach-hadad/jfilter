package com.jfilter;

import org.springframework.context.annotation.ComponentScan;

/**
 * Registers all JFilter components.
 *
 * <p>It is imported by {@link EnableJsonFilter}. Using an imported class (instead of a meta-present
 * {@link ComponentScan}) guarantees that JFilter components are registered even if the annotated class
 * declares its own {@link ComponentScan}.
 *
 * <p>The class is intentionally not annotated with a stereotype annotation (e.g. Configuration), so it is
 * never picked up by component scanning itself, only by importing it through {@link EnableJsonFilter}.
 */
@ComponentScan({"com.jfilter", "com.jfilter.components"})
public class JsonFilterScanConfiguration {
}
