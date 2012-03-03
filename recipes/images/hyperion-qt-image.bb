# Based on the Angstrom minimalist image
# For working on the mcbsp/ads127x device driver 

DEPENDS = "task-sdk-native"

ANGSTROM_EXTRA_INSTALL ?= "\
            kernel-module-libertas \
            kernel-module-libertas-sdio \
            libertas-sd-firmware \
            wireless-tools \
            devmem2 \
            openssh-ssh \
            openssh-sftp \
            openssh-scp \
            tcpdump \
            "

TOOLS_INSTALL += " \
  task-native-sdk \
  qt4-x11-free \
  libqtcore4 \
  libqtgui4 \
  libqtnetwork4 \
  qmake2 \
  qt4-x11-free-dev \
  git \
 "

IMAGE_PREPROCESS_COMMAND = "create_etc_timestamp"

IMAGE_INSTALL = "task-boot \
            util-linux-ng-mount util-linux-ng-umount \
            ${DISTRO_SSH_DAEMON} \
            ${ANGSTROM_EXTRA_INSTALL} \
            ${TOOLS_INSTALL} \
            angstrom-version \
	   "

export IMAGE_BASENAME = "hyperion-qt-image"
IMAGE_LINGUAS = "en-us"

inherit image

