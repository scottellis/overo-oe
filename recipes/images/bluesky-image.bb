# Based on the Angstrom minimalist image
# Gives a small image with ssh access and a few tools

ANGSTROM_EXTRA_INSTALL ?= " \
    devmem2 \
    openssh-ssh \
    openssh-sftp \
    openssh-scp \
 "

IMAGE_PREPROCESS_COMMAND = "create_etc_timestamp"

IMAGE_INSTALL = " \
    task-boot \
    util-linux-ng-mount util-linux-ng-umount \
    ${DISTRO_SSH_DAEMON} \
    ${ANGSTROM_EXTRA_INSTALL} \
    angstrom-version \
 "

export IMAGE_BASENAME = "bluesky-image"
IMAGE_LINGUAS = "en-us"

inherit image

