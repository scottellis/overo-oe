# Console image for Amber Optix
# Gumstix Caspa support, 2.6.34 kernel
# DSP/GStreamer support for H.264 streaming
# Includes C/C++ compiler tools and git
# Includes Python
# eth0 configure to do a dhcp request on startup



DEPENDS = "task-sdk-native gst-plugins-base gst-plugins-bad gst-plugins-good gst-plugins-ugly"

TI_DSP_INSTALL = " \
    gstreamer-ti \
    gst-plugin-videotestsrc \
    gst-plugin-rtp \
    gst-plugin-video4linux2 \
    gst-plugin-udp \
    gst-plugin-x264 \
    ti-codec-engine \
    ti-dmai \
    ti-dspbios \
    ti-dsplib \
    ti-dsplink \
    ti-dsplink-module \
    ti-cmem-module \
 "

TOOLS_INSTALL += "\
    task-native-sdk \
    git \
    python \
    samba \
    iperf \
    netperf \
    emacs \
 "

ANGSTROM_EXTRA_INSTALL ?= "\
    devmem2 \
    openssh-scp \
    openssh-sftp \
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
    ${TI_DSP_INSTALL} \
    ${FIRMWARE_INSTALL} \
    angstrom-version \
    ${SPLASH} \
 "

export IMAGE_BASENAME = "amber-optix-console-image"
IMAGE_LINGUAS = ""

inherit image

