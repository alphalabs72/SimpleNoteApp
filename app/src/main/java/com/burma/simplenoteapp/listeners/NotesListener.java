package com.burma.simplenoteapp.listeners;


import com.burma.simplenoteapp.entities.Note;

public interface NotesListener {
    void onNoteClicked(Note note, int position);
}
