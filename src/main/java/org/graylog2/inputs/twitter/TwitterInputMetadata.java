package org.graylog2.inputs.twitter;

import org.graylog2.plugin.PluginMetaData;
import org.graylog2.plugin.ServerStatus;
import org.graylog2.plugin.Version;

import java.net.URI;
import java.util.Collections;
import java.util.Set;

public class TwitterInputMetadata implements PluginMetaData {
    @Override
    public String getUniqueId() {
        return TwitterInputPlugin.class.getCanonicalName();
    }

    @Override
    public String getName() {
        return "Twitter Input Plugin";
    }

    @Override
    public String getAuthor() {
        return "Graylog, Inc.";
    }

    @Override
    public URI getURL() {
        return URI.create("http://www.graylog.com");
    }

    @Override
    public Version getVersion() {
        return new Version(1, 0, 0);
    }

    @Override
    public String getDescription() {
        return "Ingest tweets from the Twitter Firehose filtered by keywords.";
    }

    @Override
    public Version getRequiredVersion() {
        return new Version(1, 0, 0);
    }

    @Override
    public Set<ServerStatus.Capability> getRequiredCapabilities() {
        return Collections.emptySet();
    }
}
