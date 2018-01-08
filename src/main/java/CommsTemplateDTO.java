package uk.gov.ons.response.commstemplate.representation;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.List;

@Data
@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class CommsTemplateDTO {
    private String id;
    private String label;
    private String type;
    private String uri;
    private HashMap classification;
    private List params;
}
