/*
 * Copyright 2015-2018 the original author or authors.
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v2.0 which
 * accompanies this distribution and is available at
 *
 * http://www.eclipse.org/legal/epl-v20.html
 */

package com.example.mockito;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

/**
 * Test suite for the {@link MockitoExtension}.
 *
 * @since 5.0
 * @see MockitoExtension
 */
@RunWith(JUnitPlatform.class)
@SelectPackages("com.example.mockito")
public class MockitoExtensionTestSuite {
}
