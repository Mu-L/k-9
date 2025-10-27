package net.thunderbird.feature.mail.message.export.eml

import com.eygraber.uri.Uri
import net.thunderbird.core.file.FileManager
import net.thunderbird.core.file.FileOperationError
import net.thunderbird.core.outcome.Outcome

internal class FakeFileManager : FileManager {
    var lastSource: Uri? = null
    var lastDestination: Uri? = null

    var nextResult: Outcome<Unit, FileOperationError> = Outcome.Success(Unit)

    override suspend fun copy(sourceUri: Uri, destinationUri: Uri): Outcome<Unit, FileOperationError> {
        lastSource = sourceUri
        lastDestination = destinationUri
        return nextResult
    }
}
