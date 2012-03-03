# caspa-console-image
# Minimal image for testing Gumstix Caspa module
# Includes compiler tools, OpenCV dev and git
# Doesn't do network setup, you'll have to do that manually.
# 

DEPENDS = "task-sdk-native"

TOOLS_INSTALL += "\
    task-native-sdk \
    git \
    opencv-dev \
    opencv-samples-dev \
    "

ANGSTROM_EXTRA_INSTALL ?= "\
	devmem2 \
	openssh-scp \
	kernel-modules \
	"

DISTRO_SSH_DAEMON ?= "openssh"

IMAGE_PREPROCESS_COMMAND = "create_etc_timestamp"

IMAGE_INSTALL = "task-boot \
            util-linux-ng-mount util-linux-ng-umount \
            ${DISTRO_SSH_DAEMON} \
            ${ANGSTROM_EXTRA_INSTALL} \
			${TOOLS_INSTALL} \
            angstrom-version \
            ${SPLASH} \
	   "

export IMAGE_BASENAME = "caspa-console-image"
IMAGE_LINGUAS = ""

inherit image

