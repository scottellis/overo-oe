# Console image for use with Syntro
# Includes C/C++ compiler tools, Qt, OpenCV, perl, python and git
# eth0 should come up as a dhcp client
# 

DEPENDS = "task-sdk-native"


TOOLS_INSTALL += "\
    task-native-sdk \
    git \
    opencv-dev \
    opencv-samples-dev \
    qt4-x11-free \
    qt4-x11-free-dev \
    libqtcore4 \
    libqtgui4 \
    libqtnetwork4 \
    qmake2 \
    python \
    perl \
    "

ANGSTROM_EXTRA_INSTALL ?= "\
    devmem2 \
    openssh-scp \
    kernel-modules \
    wireless-tools \
    "

FIRMWARE_INSTALL = " \
  libertas-sd-firmware \
  "

DISTRO_SSH_DAEMON ?= "openssh"

IMAGE_PREPROCESS_COMMAND = "create_etc_timestamp"

IMAGE_INSTALL = "task-boot \
    util-linux-ng-mount util-linux-ng-umount \
    ${DISTRO_SSH_DAEMON} \
    ${ANGSTROM_EXTRA_INSTALL} \
    ${TOOLS_INSTALL} \
    ${FIRMWARE_INSTALL} \
    angstrom-version \
    ${SPLASH} \
 "

export IMAGE_BASENAME = "syntro-console-image"
IMAGE_LINGUAS = ""

inherit image

