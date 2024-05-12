package com.example.note_writer.fragments

import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Note
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.MenuHost
import androidx.core.view.MenuProvider
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentContainer
import androidx.lifecycle.Lifecycle
import androidx.navigation.fragment.navArgs
import com.example.note_writer.viewmodel.NoteViewModel
import com.example.notewriter.R
import com.example.notewriter.databinding.FragmentEditNoteBinding

class EditNoteFragment : Fragment(R.layout.fragment_edit_note),MenuProvider{

    private var editNoteBinding: FragmentEditNoteBinding? = null
    private val binding get() = editNoteBinding!!

    private lateinit var notesViewModel: NoteViewModel
    private lateinit var currentNote:Note

    private val args: HomeFragmentArgs by navArgs()

    override fun onCreateView(
        inflater:LayoutInflater, container: ViewGroup?,
        savedInstanceState:Bundle?
    ): View?{
        return inflater.inflate(R.layout.fragment_edit_note,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View,savedInstanceState: Bundle?){
        super.onViewCreated(view, savedInstanceState)

        val menuHost:MenuHost = requireActivity()
        menuHost.addMenuProvider(this,viewLifecycleOwner,Lifecycle.State)

    }

}