package org.kyungmin0729.configs;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix="file.upload")
public class FileConfig {
    private String path;
    private String url;
}