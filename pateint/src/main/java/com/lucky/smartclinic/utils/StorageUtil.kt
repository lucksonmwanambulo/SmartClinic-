package com.lucky.smartclinic.utils

import com.google.firebase.storage.FirebaseStorage
import com.google.firebase.storage.StorageReference
import java.util.*


object StorageUtil {
    private val storageInstance: FirebaseStorage by lazy { FirebaseStorage.getInstance() }

    private val currentUserRef: StorageReference
        get() = storageInstance.reference
                .child(FireStoreUtils.firebaseAuth.currentUser?.uid ?: throw NullPointerException("UID is null."))

    fun uploadProfilePhoto(imageBytes: ByteArray,
                           onSuccess: (imagePath: String) -> Unit) {
        val ref = currentUserRef.child("profilePictures/${UUID.nameUUIDFromBytes(imageBytes)}")
        ref.putBytes(imageBytes)
                .addOnSuccessListener {
                    onSuccess(ref.path)
                }
    }
    fun uploadImageMessage(
            imageBytes: ByteArray,
            onSuccess: (imagePath: String) -> Unit
    ) {
        val ref = currentUserRef.child("messages/${UUID.nameUUIDFromBytes(imageBytes)}")
        ref.putBytes(imageBytes)
                .addOnSuccessListener {
                    onSuccess(ref.path)
                }
    }

    fun pathToReference(path: String) = storageInstance.getReference(path)
}