#Angstrom minimalist image
#gives you a small image with ssh access

ANGSTROM_EXTRA_INSTALL ?= "\
	devmem2 \
	openssh-scp \
#	tcpdump \
	"

DISTRO_SSH_DAEMON ?= "openssh"

IMAGE_PREPROCESS_COMMAND = "create_etc_timestamp"

IMAGE_INSTALL = "task-boot \
            util-linux-ng-mount util-linux-ng-umount \
            ${DISTRO_SSH_DAEMON} \
            ${ANGSTROM_EXTRA_INSTALL} \
            angstrom-version \
            ${SPLASH} \
	   "

export IMAGE_BASENAME = "work-image"
IMAGE_LINGUAS = ""

inherit image

