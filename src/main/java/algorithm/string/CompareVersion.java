package algorithm.string;

public class CompareVersion {
    public int compareVersion(String version1, String version2) {
        String[] revisions1 = version1.split("\\.");
        String[] revisions2 = version2.split("\\.");

        for (int i = 0; i < Math.max(revisions1.length, revisions2.length); i++) {
            Integer revision1 = getRevision(revisions1, i);
            Integer revision2 = getRevision(revisions2, i);

            if (revision1 != revision2) {
                return Integer.compare(revision1, revision2);
            }
        }

        return 0;
    }

    private Integer getRevision(String[] revisions, int index) {
        if (index >= revisions.length) {
            return 0;
        }

        return Integer.valueOf(revisions[index]);
    }
}
