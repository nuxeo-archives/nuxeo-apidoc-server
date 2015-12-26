/*
 * (C) Copyright 2012 Nuxeo SA (http://nuxeo.com/) and others.
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
 *
 * Contributors:
 *     Thierry Delprat
 */
package org.nuxeo.apidoc.test;

import java.io.File;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.nuxeo.apidoc.documentation.XMLContributionParser;
import org.nuxeo.common.utils.FileUtils;
import org.nuxeo.runtime.test.runner.Features;
import org.nuxeo.runtime.test.runner.FeaturesRunner;
import org.nuxeo.runtime.test.runner.RuntimeFeature;

@RunWith(FeaturesRunner.class)
@Features(RuntimeFeature.class)
public class TestXMLParser {

    @Test
    public void testParser() throws Exception {

        File xmlFile = FileUtils.getResourceFileFromContext("sample-fragment-contrib.xml");
        String xml = FileUtils.readFile(xmlFile);

        String html = XMLContributionParser.prettyfy(xml);

    }
}
