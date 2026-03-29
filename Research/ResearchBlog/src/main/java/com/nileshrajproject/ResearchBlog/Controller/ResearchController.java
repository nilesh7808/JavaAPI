package com.nileshrajproject.ResearchBlog.Controller;

import com.nileshrajproject.ResearchBlog.Entity.ResearchEntry;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/research") // it will work as common for all mapping like "/research/detailsResearch" for getting all ids
public class ResearchController {

    public Map<Long, ResearchEntry> researchEntryMap = new HashMap<>();

    // get all enteries
    @GetMapping("/detailsResearch")
    public List<ResearchEntry> getAllResearch(){
        return new ArrayList<>(researchEntryMap.values());
    }

    // creating new enteries
    @PostMapping
    public String createResearch(@RequestBody ResearchEntry myResearchEntry){
        researchEntryMap.put(myResearchEntry.getId(), myResearchEntry);
        return "SUCCESS";
    }

    // getting reasearches by id
    @GetMapping("detailsResearch/id/{myId}")
    public ResearchEntry getResearchById(@PathVariable Long myId){
        return researchEntryMap.get(myId);
    }

    //updating research by Id
    @PutMapping("detailsResearch/update/{myId}")
    public ResearchEntry updateReseatchById(@PathVariable Long myId, @RequestBody ResearchEntry myUpdatedResearchEntry){
        return researchEntryMap.put(myId, myUpdatedResearchEntry);
    }

    // deleting research by id
    @DeleteMapping("detailsResearch/del/{myId}")
    public ResearchEntry deleteResearch(@PathVariable Long myId){
        return researchEntryMap.remove(myId);
    }

}
