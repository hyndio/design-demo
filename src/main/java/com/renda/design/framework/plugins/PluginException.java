package com.renda.design.framework.plugins;

@SuppressWarnings("serial")
public class PluginException extends RuntimeException {

    public PluginException(String pluginName, Throwable cause) {
        super(String.format("Plugin '%s' can NOT work", pluginName), cause);
    }

}
