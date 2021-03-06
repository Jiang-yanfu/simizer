package fr.isep.simizer.storage;

import fr.isep.simizer.processor.tasks.DiskTask;

/**
 * The possible types for storage-based IO operations.
 * <p>
 * These are used within the {@link DiskTask} tasks to specify the kind of
 * action that should occur.
 */
public enum IOType {
  /** Represents an IO action that reads data. */
  READ,

  /** Represents and IO action that writes data. */
  WRITE,

  /** Represents an IO action that modifies data. */
  MODIFY,
}
