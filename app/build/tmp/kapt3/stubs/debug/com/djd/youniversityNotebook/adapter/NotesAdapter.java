package com.djd.youniversityNotebook.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002 !B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0012H\u0016J\u0018\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0012H\u0016J\u0014\u0010\u001b\u001a\u00020\u00142\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00060\u001dJ\u000e\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\fR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006\""}, d2 = {"Lcom/djd/youniversityNotebook/adapter/NotesAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/djd/youniversityNotebook/adapter/NotesAdapter$NotesViewHolder;", "()V", "arrList", "Ljava/util/ArrayList;", "Lcom/djd/youniversityNotebook/entities/Notes;", "getArrList", "()Ljava/util/ArrayList;", "setArrList", "(Ljava/util/ArrayList;)V", "listener", "Lcom/djd/youniversityNotebook/adapter/NotesAdapter$OnItemClickListener;", "getListener", "()Lcom/djd/youniversityNotebook/adapter/NotesAdapter$OnItemClickListener;", "setListener", "(Lcom/djd/youniversityNotebook/adapter/NotesAdapter$OnItemClickListener;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setData", "arrNotesList", "", "setOnClickListener", "listener1", "NotesViewHolder", "OnItemClickListener", "app_debug"})
public final class NotesAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.djd.youniversityNotebook.adapter.NotesAdapter.NotesViewHolder> {
    @org.jetbrains.annotations.Nullable()
    private com.djd.youniversityNotebook.adapter.NotesAdapter.OnItemClickListener listener;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.djd.youniversityNotebook.entities.Notes> arrList;
    
    @org.jetbrains.annotations.Nullable()
    public final com.djd.youniversityNotebook.adapter.NotesAdapter.OnItemClickListener getListener() {
        return null;
    }
    
    public final void setListener(@org.jetbrains.annotations.Nullable()
    com.djd.youniversityNotebook.adapter.NotesAdapter.OnItemClickListener p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.djd.youniversityNotebook.entities.Notes> getArrList() {
        return null;
    }
    
    public final void setArrList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.djd.youniversityNotebook.entities.Notes> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.djd.youniversityNotebook.adapter.NotesAdapter.NotesViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void setData(@org.jetbrains.annotations.NotNull()
    java.util.List<com.djd.youniversityNotebook.entities.Notes> arrNotesList) {
    }
    
    public final void setOnClickListener(@org.jetbrains.annotations.NotNull()
    com.djd.youniversityNotebook.adapter.NotesAdapter.OnItemClickListener listener1) {
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.djd.youniversityNotebook.adapter.NotesAdapter.NotesViewHolder holder, int position) {
    }
    
    public NotesAdapter() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/djd/youniversityNotebook/adapter/NotesAdapter$NotesViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "app_debug"})
    public static final class NotesViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        
        public NotesViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/djd/youniversityNotebook/adapter/NotesAdapter$OnItemClickListener;", "", "onClicked", "", "noteId", "", "app_debug"})
    public static abstract interface OnItemClickListener {
        
        public abstract void onClicked(int noteId);
    }
}