package com.daniel_liao.ticketsellingsystem.event;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class BindSectionForm {
    private Integer eventID;
    private Integer sectionID;
}
