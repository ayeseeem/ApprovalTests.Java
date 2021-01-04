package org.approvaltests.core;

import org.approvaltests.reporters.EnvironmentAwareReporter;
import org.packagesettings.Field;

public class ApprovalTestPackageSettings
{
  public static final Field<EnvironmentAwareReporter> FRONTLOADED_REPORTER = new Field<>("FrontloadedReporter",
      EnvironmentAwareReporter.class);
  public static final Field<ApprovalFailureReporter>  USE_REPORTER         = new Field<>("UseReporter",
      ApprovalFailureReporter.class);
    public static final Field<String> USE_APPROVAL_SUBDIRECTORY = new Field<>("UseApprovalSubdirectory", String.class);
    public static final Field<String> APPROVAL_BASE_DIRECTORY = new Field<>("ApprovalBaseDirectory", String.class);
}
