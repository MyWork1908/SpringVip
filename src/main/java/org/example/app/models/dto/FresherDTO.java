package org.example.app.models.dto;

import lombok.*;

@Setter @Getter
@AllArgsConstructor
@NoArgsConstructor
public class FresherDTO {
    private String fresherId;
    private String fresherName;
    private String fresherAddress;
    private String fresherPhone;
    private String fresherEmail;
}
