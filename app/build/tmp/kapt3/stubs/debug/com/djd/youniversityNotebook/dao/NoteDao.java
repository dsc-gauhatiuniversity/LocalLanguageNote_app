package com.djd.youniversityNotebook.dao;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\fH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u0019\u0010\u000e\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u0019\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0011"}, d2 = {"Lcom/djd/youniversityNotebook/dao/NoteDao;", "", "deleteNote", "", "note", "Lcom/djd/youniversityNotebook/entities/Notes;", "(Lcom/djd/youniversityNotebook/entities/Notes;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteSpecificNote", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllNotes", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSpecificNote", "insertNotes", "updateNote", "app_debug"})
public abstract interface NoteDao {
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM notes ORDER BY id DESC")
    public abstract java.lang.Object getAllNotes(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.djd.youniversityNotebook.entities.Notes>> p0);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM notes WHERE id =:id")
    public abstract java.lang.Object getSpecificNote(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.djd.youniversityNotebook.entities.Notes> p1);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract java.lang.Object insertNotes(@org.jetbrains.annotations.NotNull()
    com.djd.youniversityNotebook.entities.Notes note, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Delete()
    public abstract java.lang.Object deleteNote(@org.jetbrains.annotations.NotNull()
    com.djd.youniversityNotebook.entities.Notes note, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "DELETE FROM notes WHERE id =:id")
    public abstract java.lang.Object deleteSpecificNote(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Update()
    public abstract java.lang.Object updateNote(@org.jetbrains.annotations.NotNull()
    com.djd.youniversityNotebook.entities.Notes note, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
}