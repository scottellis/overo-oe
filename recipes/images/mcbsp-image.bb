# Based on the Angstrom minimalist image
# For working on the mcbsp/ads127x device driver 

ANGSTROM_EXTRA_INSTALL ?= "\
            devmem2 \
            "

IMAGE_PREPROCESS_COMMAND = "create_etc_timestamp"

IMAGE_INSTALL = "task-boot \
            util-linux-ng-mount util-linux-ng-umount \
            ${ANGSTROM_EXTRA_INSTALL} \
            angstrom-version \
	   "

export IMAGE_BASENAME = "mcbsp-image"
IMAGE_LINGUAS = ""

inherit image
