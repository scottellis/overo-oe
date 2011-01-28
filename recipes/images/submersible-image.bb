# Based on the Angstrom minimalist image
# Gives a small image with ssh access, a few tools and some

ANGSTROM_EXTRA_INSTALL ?= "\
            devmem2 \
            openssh-ssh \
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

export IMAGE_BASENAME = "submersible-image"
IMAGE_LINGUAS = ""

inherit image

