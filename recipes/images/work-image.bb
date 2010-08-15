# Based on the Angstrom minimalist image
# Gives a small image with ssh access, a few tools and some
# kernel modules I use regularly.

ANGSTROM_EXTRA_INSTALL ?= "\
            kernel-module-g-ether \
            kernel-module-g-serial \
            kernel-module-omap2-mcspi \
            devmem2 \
            openssh-ssh \
            openssh-sftp \
            openssh-scp \
            tcpdump \
            "

IMAGE_PREPROCESS_COMMAND = "create_etc_timestamp"

IMAGE_INSTALL = "task-boot \
            util-linux-ng-mount util-linux-ng-umount \
            ${DISTRO_SSH_DAEMON} \
            ${ANGSTROM_EXTRA_INSTALL} \
            angstrom-version \
	   "

export IMAGE_BASENAME = "work-image"
IMAGE_LINGUAS = ""

inherit image

