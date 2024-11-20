package com.springjournal.InscribeMe.controller;

import com.springjournal.InscribeMe.Entity.JournalEntry;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/journal")
public class JournalEntryController {

    private Map<Long, JournalEntry> Journalentries = new HashMap<>();

    @GetMapping
    public List<JournalEntry> getAll(){
        return new ArrayList<>(Journalentries.values());

    }

    @PostMapping
    public boolean createEntry(@RequestBody JournalEntry entry){
Journalentries.put(entry.getId(), entry); return true;
}
}