package com.example.advancenotes.listeners;

import com.example.advancenotes.entities.Note;

public interface NotesListener {
    void onNoteClicked(Note note,int position);
}
